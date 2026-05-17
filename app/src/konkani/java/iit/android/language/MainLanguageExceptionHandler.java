package iit.android.language;

import iit.android.language.ExceptionHandler;
import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;
import android.content.Context;
import android.view.inputmethod.InputConnection;

import java.util.ArrayList;
import java.util.HashMap;
import android.util.SparseArray;

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
	private SparseArray<KeyAttr> mKeys;
	private Language main;

	private static final String RA = "\u0930";
	private static final String HALANT = "\u094D";
	private static final String EYELASHRA = "\u0930";
	private static final String ZWJ = "\u200D";

	private static final int RAFARCODE = 53;
	private static final int TRAKARCODE = 52;
	private static final int EYELASHRACODE = 51;

	public MainLanguageExceptionHandler(Language lang, Context context, InputConnection ic){
		main = lang;
		initializeKeyArray();
	}
	public SparseArray<KeyAttr> handleException(int keyCode){
		SparseArray<KeyAttr> sKeys = new SparseArray<KeyAttr>();
		switch(keyCode){
			case EYELASHRACODE:
				handleEyelashRa(sKeys);
				break;
			case TRAKARCODE:
				handleTrakar(sKeys);
				break;
			case RAFARCODE:
				handleRafar(sKeys);
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
			mKeys = main.hashThis();
		}
	}

	private void handleRafar(SparseArray<KeyAttr> sKeys) {
		for(KeyAttr key : keyArray){
			String newLabel = RA + HALANT + mKeys.get(key.code).label;
			key.label = newLabel;
			key.showChakra = true;
			sKeys.put(key.code, key);
		}
	}

	private void handleTrakar(SparseArray<KeyAttr> sKeys) {
		for(KeyAttr key : keyArray){
			String newLabel = mKeys.get(key.code).label + HALANT + RA;
			key.label = newLabel;
			key.showChakra = true;
			sKeys.put(key.code, key);
		}
	}

	private void handleEyelashRa(SparseArray<KeyAttr> sKeys) {
		for(KeyAttr key : keyArray){
			String newLabel = EYELASHRA + HALANT + ZWJ + mKeys.get(key.code).label;
			key.label = newLabel;
			key.showChakra = true;
			sKeys.put(key.code, key);
		}
	}

}
