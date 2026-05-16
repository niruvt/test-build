package iit.android.language;

import iit.android.language.ExceptionHandler;
import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;
import android.content.Context;
import android.view.inputmethod.InputConnection;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;

public class MainLanguageExceptionHandler implements ExceptionHandler {
    public java.util.ArrayList<Character> languageConsonants = null;
    public java.util.ArrayList<Character> chakraVowelModifiers = null;
    public java.util.ArrayList<Character> chakraWholeVowels = null;
    public java.util.ArrayList<Character> specialCases = null;

    public void handleBackSpaceDeleteChar(android.view.inputmethod.InputConnection ic) {
        // not implemented for this language
    }


	private ArrayList<KeyAttr> keyArray;
	private HashMap<Integer, KeyAttr> mKeys;
	private Language main;

	private static final String RA = "\u0d30";
	private static final String HALANT = "\u0D4D";

	private static final int TRAKARCODE = 53;

	public MainLanguageExceptionHandler(Language lang, Context context, InputConnection ic){
		main = lang;
		initializeKeyArray();
		mKeys = main.hashThis();
	}

	@SuppressLint("UseSparseArrays")
	public HashMap<Integer, KeyAttr> handleException(int keyCode){
		HashMap<Integer, KeyAttr> sKeys = new HashMap<Integer, KeyAttr>();
		switch(keyCode){
			case TRAKARCODE:
				handleTrakar(sKeys);
				break;
		}
		initializeKeyArray();
		return sKeys;
	}

	private void initializeKeyArray(){
		keyArray = new ArrayList<KeyAttr>();
		int halantEnd = main.halantEnd;
		for(int i = 0; i < halantEnd; i++){
			KeyAttr key = new KeyAttr();
			key.code = i+1;
			keyArray.add(key);
					}
	}


	private void handleTrakar(HashMap<Integer, KeyAttr> sKeys) {
		for(KeyAttr key : keyArray){
			String newLabel = mKeys.get(key.code).label + HALANT + RA;
			key.label = newLabel;
			key.showChakra = true;
			sKeys.put(key.code, key);
		}
	}

}
