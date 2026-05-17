package iit.android.swarachakra;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.content.ContextCompat;
import android.widget.RelativeLayout;

import java.util.HashMap;
import java.util.List;

import iit.android.language.Language;
import iit.android.language.MainLanguage;
import iit.android.language.english.English;
import iit.android.settings.SettingsActivity;

/**
 * Input Method Service that runs when the keyboard is up and manages the whole life cycle of the keyboard
 *
 * @author Manideep Polireddi, Madhu Kiran
 */
public class SoftKeyboard extends InputMethodService {

    private CustomKeyboardView mKeyboardView;
    private Keyboard mKeyboard;
    private HashMap<Integer, KeyAttr> mKeys;
    private HashMap<Integer, KeyAttr> mainKeys;
    private HashMap<Integer, KeyAttr> englishKeys;
    private MainLanguage mainLanguage;
    public String mainLanguageSymbol;
    private English english;
    private Language language;
    private InputConnection mInputConnection;
    private String languageName = "";
    private Context mContext;
    private String displayMode, layoutName;
    private Key mEnterKey;
    private static Context appContext = null;
    private boolean isPassword;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    @Override
    public void onInitializeInterface() {
        mainLanguage = new MainLanguage();
        mainKeys = mainLanguage.hashThis();
        mainLanguageSymbol = mainLanguage.symbol;

        english = new English();
        englishKeys = english.hashThis();

        if (languageName.isEmpty()) {
            setLanguage("main");
        } else {
            setLanguage(languageName);
        }

    }

    @Override
    public View onCreateInputView() {


         /*        Log.d("dbgm", "Height:" + mKeyboardView.getHeight());*/

        mContext = this;
        layoutName = "";

        if (languageName.isEmpty()) {
            setLanguage("main");
        } else {
            setLanguage(languageName);
        }

        detectDisplayMode();
        int keyboardViewResourceId = getKeyboardViewResourceId();
        final RelativeLayout layout = (RelativeLayout) getLayoutInflater()
                .inflate(keyboardViewResourceId, null);

        try {
            /*layout = (RelativeLayout) getLayoutInflater()
                    .inflate(keyboardViewResourceId, null);*/

            if (languageName.equals("main")) {

                mKeyboardView = (MainKeyboardView) layout.findViewById(R.id.keyboard);

            } else {
                mKeyboardView = (EnglishKeyboardView) layout.findViewById(R.id.keyboard);
            }

            int resourceId = getResourceId("default");
            mKeyboard = new Keyboard(this, resourceId);
            mKeyboardView.setKeyboard(mKeyboard);

            mKeyboardView.init(this, language, mKeys);

            updateFullscreenMode();

            setKeys();
            mKeyboardView.invalidateAllKeys();

        } catch (Exception ex) {
            //return;
            //final RelativeLayout layout = null;
        }

        return layout;
    }

    @Override
    public void onFinishInputView(boolean finishingInput) {
        super.onFinishInputView(finishingInput);


    }

    public static Context appContext() {
        return appContext;
    }

    /**
     * Generates the layout resource id for the keyboard view based on the displayMode and current language
     *
     * @return layout resource id of the keyboard view to be shown
     */
    private int getKeyboardViewResourceId() {

        SharedPreferences prefs;//UserSettings.getPrefs();
        prefs = PreferenceManager.getDefaultSharedPreferences(appContext());

        String layout = getResources().getString(
                R.string.layout);
        String screensize = getResources().getString(R.string.layout_screensize);
        //String theme = getResources().getString(R.string.layout_theme);


        String layoutName = SettingsActivity.getLayoutName(prefs.getInt(layout, SettingsActivity.LAYOUT_HIVE));
        String sizeName = SettingsActivity.getScreenSizeName(prefs.getInt(screensize, SettingsActivity.SCREENSIZE_SMALL_NORMAL));
        //String themeName =  SettingsActivity.getThemeName(prefs.getInt(theme,SettingsActivity.THEME1));
        String file = "";
        //layout_orient_screensize_lang_layer_theme.xml
        if (languageName.equals("english")) {
            file = "kview_" + displayMode + languageName;
        } else {
            file = "kview_" + displayMode + sizeName + "_" + languageName + "_" + layoutName;
        }

        //String file = "kview_" + displayMode + languageName;
        int output = getResources().getIdentifier(file, "layout",
                getPackageName());

        // if the requested layout (e.g. hex) is not available for this language,
        // fall back to the rect layout which exists for all languages
        if (output == 0 && layoutName.equals("hex_")) {
            String rectFile;
            if (languageName.equals("english")) {
                rectFile = "kview_" + displayMode + languageName;
            } else {
                rectFile = "kview_" + displayMode + sizeName + "_" + languageName + "_" + "rect_";
            }
            output = getResources().getIdentifier(rectFile, "layout", getPackageName());
        }

        return output;
    }

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting) {


        mInputConnection = getCurrentInputConnection();

        if (mInputConnection == null)

        mKeyboardView.resetInputConnection(mInputConnection);
        mKeyboardView.setAlpha(1);
        setImeOptions();

        String prevDisplayMode = displayMode;
        detectDisplayMode();

        if (displayMode != prevDisplayMode) {

            setInputView(onCreateInputView());
        } else {
        }

        mKeyboardView.keys = mKeyboardView.getKeyboard().getKeys();
        //setInputView(onCreateInputView());

        //Display dm = mKeyboardView.getDisplay();


        /*        Log.d("dbgm", "Height:" + mKeyboardView.getHeight());*/


    }

    @Override
    public boolean onEvaluateFullscreenMode() {
        return false;
    }

    /**
     * sets the labels to the keys on the keyboard
     */
    private void setKeys() {
        List<Key> keys = mKeyboard.getKeys();
        for (Key key : keys) {
            if (mKeys.containsKey(key.codes[0])) {

                if (key.codes[0] == 400) {
                    //key.gap = 500;
                }

                KeyAttr tempKey = mKeys.get(key.codes[0]);
                key.label = tempKey.label;

                if (tempKey.showIcon) {
                    int id = getDrawableId(tempKey.icon);
                    if (id != 0) {
                        key.icon = ContextCompat.getDrawable(this, id);
                        key.label = null;
                    }
                }
            }
        }
        setImeOptions();
    }

    /**
     * changes the keyboard in the keyboardView
     *
     * @param layoutFile layout id of the layout to be loaded into the keyboardView
     */
    public void changeKeyboard(String layoutFile) {

        String prevDisplayMode = displayMode;
        detectDisplayMode();


        if (prevDisplayMode != displayMode) {

            setInputView(onCreateInputView());

        } else {

            /*//mif (layoutName.equals(layoutFile))
            else {
                //setInputView(onCreateInputView());
            }*/

            /*if(reLoadLayout){
                reLoadLayout = false;
                //setInputView(onCreateInputView());
            }else
                Log.d("dbgm", "Dont change keyboard ");*/
        }
        //setInputView(onCreateInputView());

        int resourceId = getResourceId(layoutFile);
        if (resourceId != 0) {
            mKeyboard = new Keyboard(mContext, resourceId);
            setKeys();
            mKeyboardView.setKeyboard(mKeyboard);

            //mKeyboardView.setBackground(getResourceBackgroundID(layoutFile));
            if (languageName != "english")
                mKeyboardView.setBackgroundResource(getResourceBackgroundID(layoutFile));

        } else {
        }

        layoutName = layoutFile;

    }

    /**
     * sets the current language and keys hashmap according to the language
     *
     * @param name name of the language
     */
    public void setLanguage(String name) {
        languageName = name;
        if (name == "english") {
            language = english;
            mKeys = englishKeys;
        } else {
            language = mainLanguage;
            mKeys = mainKeys;
        }
    }

    /**
     * Changes the language of the keyboard from english to main language and vice-versa
     */
    public void changeLanguage() {
        if (languageName.equals("main")) {
            language = english;
            languageName = "english";
            setLanguage("english");
        } else {
            language = mainLanguage;
            languageName = "main";
            setLanguage("main");
        }
        setInputView(onCreateInputView());
    }

    public boolean showTablet(Context context) {


        // SharedPreferences settings = mySharedPreferences();
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(SoftKeyboard.appContext());
        SharedPreferences.Editor editor = settings.edit();
        String key = context.getResources().getString(R.string.layout_screensize);
        boolean isFirstRun = settings.getBoolean("is_first_run", true);
        int tempVal = 0;

        if (isFirstRun) {
            editor.putBoolean("is_first_run", false);

            //editor.putBoolean(key, isTablet(context));

			/*if(isTablet(context)){
                editor.putInt(key, 2);
			}else
				editor.putInt(key, 1);*/
            tempVal = isTablet(context);
            editor.putInt(key, tempVal);

            editor.commit();
        } else {

            tempVal = settings.getInt(key, SettingsActivity.SCREENSIZE_SMALL_NORMAL);
        }

        boolean showTabletLayout = (tempVal == SettingsActivity.SCREENSIZE_ATLEAST_LARGE) ? true : false;//settings.getBoolean(key, false);
        return showTabletLayout;
    }

    public static int isTablet(Context context) {
		/*return (context.getResources().getConfiguration().screenLayout
	            & Configuration.SCREENLAYOUT_SIZE_MASK)
				>= Configuration.SCREENLAYOUT_SIZE_LARGE;*/


        if ((context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE) {
            return SettingsActivity.SCREENSIZE_ATLEAST_LARGE;

        } else {

            return SettingsActivity.SCREENSIZE_SMALL_NORMAL;
        }
    }



    /**
     * Detects the display config(landscape or portrait) and sets the displayMode accordingly
     */
    public void detectDisplayMode() {
        int dispMode = getResources().getConfiguration().orientation;

        if (dispMode == 1) {
            displayMode = "port_";
            //if(showTablet(mContext)){displayMode = "tablet_";}
        } else {
            displayMode = "land_";
        }
    }

    /**
     * Gets the layout file resource id of the keyboard based on displayMode and languageName
     *
     * @param layoutFile layout of the keyboard whose resource id is to be returned
     * @return Resource id of the layout file of the keyboard to be shown
     */
    public int getResourceId(String layoutFile) {


        int resourceId = 0;
        //hex
        //resourceId = getResources().getIdentifier(languageName + "_" + displayMode + layoutFile, "layout",getPackageName());

        //SharedPreferences prefs = UserSettings.getPrefs();
        SharedPreferences prefs;
        prefs = PreferenceManager.getDefaultSharedPreferences(appContext());

        String layout = getResources().getString(
                R.string.layout);
        String screensize = getResources().getString(
                R.string.layout_screensize);
        String theme = getResources().getString(
                R.string.layout_theme);
        String kbHeight = getResources().getString(
                R.string.layout_height);
        //prefs.getInt(kbHeight, getRecommendedHeight());


        String layoutName = SettingsActivity.getLayoutName(prefs.getInt(layout, SettingsActivity.LAYOUT_HIVE));
        String sizeName = SettingsActivity.getScreenSizeName(prefs.getInt(screensize, SettingsActivity.SCREENSIZE_SMALL_NORMAL));
        String themeName = SettingsActivity.getThemeName(prefs.getInt(theme, SettingsActivity.THEME1));
        String kbHeightSetting = SettingsActivity.getLayoutHeightName(prefs.getInt(layout, SettingsActivity.LAYOUT_HIVE), prefs.getInt(kbHeight, 1));

        //layout_orient_screensize_lang_layer_theme.xml
        String name = "";

        if (languageName.equals("english")) {

            name = displayMode + languageName + "_" + layoutFile + "_" + themeName;
        } else {
            name = layoutName + displayMode + sizeName + "_" + languageName + "_" + layoutFile + "_" + themeName + kbHeightSetting;
        }
        //String name = layoutName+displayMode+languageName+"_"+layoutFile+"_"+themeName;

        resourceId = getResources().getIdentifier(name, "layout", getPackageName());

        return resourceId;
    }

    public int getResourceBackgroundID(String layoutFile) {

        int resourceId = 0;
        //hex
        //resourceId = getResources().getIdentifier(languageName + "_" + displayMode + layoutFile, "layout",getPackageName());

        SharedPreferences prefs;//UserSettings.getPrefs();
        prefs = PreferenceManager.getDefaultSharedPreferences(appContext());
        String layout = getResources().getString(
                R.string.layout);
        String screensize = getResources().getString(
                R.string.layout_screensize);
        String theme = getResources().getString(
                R.string.layout_theme);


        String layoutName = SettingsActivity.getLayoutName(prefs.getInt(layout, SettingsActivity.LAYOUT_HIVE));
        String sizeName = SettingsActivity.getScreenSizeName(prefs.getInt(screensize, SettingsActivity.SCREENSIZE_SMALL_NORMAL));
        String themeName = SettingsActivity.getThemeName(prefs.getInt(theme, SettingsActivity.THEME1));

        //layout_orient_screensize_lang_layer_theme.xml
        String name = "";
        if (languageName.equals("english")) {

            //name = displayMode+languageName+"_"+layoutFile+"_"+themeName;
        } else {
            name = layoutName + displayMode + sizeName + "_" + languageName + "_" + layoutFile + "_" + themeName;
        }
        //String name = layoutName+displayMode+languageName+"_"+layoutFile+"_"+themeName;

        resourceId = getResources().getIdentifier(name, "drawable", getPackageName());

        return resourceId;
    }

    /**
     * Gets the resource id of the drawable
     *
     * @param drawable drawable name of whose resource id is to be returned
     * @return Drawable id in the resources
     */
    public int getDrawableId(String drawable) {
        int resourceId = 0;
        resourceId = getResources().getIdentifier(drawable, "drawable",
                getPackageName());
        return resourceId;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (mInputConnection != null) {
            mInputConnection.setComposingText("", 1);
            mInputConnection.finishComposingText();
            mKeyboardView.configChanged();
            ;
        }
        super.onConfigurationChanged(newConfig);
    }

    /**
     * Changes the appearance of the enter key based on IME options
     */
    void setImeOptions() {
        Resources res = getResources();
        EditorInfo ei = getCurrentInputEditorInfo();
        int textOptions = ei.inputType;
        int options = ei.imeOptions;
        for (Key k : mKeyboard.getKeys()) {
            if (k.codes[0] == mKeyboardView.getEnterKeyCode()) {
                mEnterKey = k;
            }
        }
        if (mEnterKey == null) {
            return;
        }

        switch (options
                & (EditorInfo.IME_MASK_ACTION | EditorInfo.IME_FLAG_NO_ENTER_ACTION)) {
            case EditorInfo.IME_ACTION_GO:
                mEnterKey.iconPreview = null;

                mEnterKey.label = "Go";
                // mEnterKey.icon = ContextCompat.getDrawable(this, R.drawable.sym_keyboard_return);
                break;
            case EditorInfo.IME_ACTION_NEXT:
                mEnterKey.iconPreview = null;
                mEnterKey.icon = null;
                // mEnterKey.icon = ContextCompat.getDrawable(this, R.drawable.sym_keyboard_return);
                mEnterKey.label = "Next";
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_EMAIL_SUBJECT:
                mEnterKey.iconPreview = null;
                mEnterKey.icon = null;
                mEnterKey.label = "NEXT";
                break;
            case EditorInfo.IME_ACTION_DONE:
                mEnterKey.iconPreview = null;
                mEnterKey.icon = null;
                mEnterKey.label = "Done";

                break;
            case EditorInfo.IME_ACTION_SEARCH:
                mEnterKey.icon = ContextCompat.getDrawable(this, R.drawable.ic_action_search);
                break;
            case EditorInfo.IME_ACTION_SEND:
                mEnterKey.iconPreview = null;
                mEnterKey.label = "Send";
                break;
            default:
                mEnterKey.icon = ContextCompat.getDrawable(this, R.drawable.sym_keyboard_return);
                mEnterKey.label = null;
                break;
        }

        switch (textOptions) {
            case EditorInfo.TYPE_NUMBER_VARIATION_PASSWORD:
                this.setPassword(true);
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_PASSWORD:
                this.setPassword(true);
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD:
                this.setPassword(true);
                break;
            case EditorInfo.TYPE_TEXT_VARIATION_WEB_PASSWORD:
                this.setPassword(true);
                break;
            default:
                this.setPassword(false);
                break;
        }
        mKeyboardView.invalidateAllKeys();
    }


    public boolean isPassword() {
        return isPassword;
    }

    public void setPassword(boolean isPassword) {
        this.isPassword = isPassword;
    }
}
