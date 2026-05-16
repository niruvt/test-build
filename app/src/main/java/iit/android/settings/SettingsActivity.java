package iit.android.settings;

/***
 * Modernised: replaced PreferenceActivity with AppCompatActivity.
 * Original logic preserved; only the Activity base class and support library
 * imports have been updated.
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import iit.android.swarachakra.R;

public class SettingsActivity extends AppCompatActivity {
    public final static int SCREENSIZE_ATLEAST_LARGE = 2;
    public final static int SCREENSIZE_SMALL_NORMAL = 1;
    public final static int ORIENTATION_PORTRAIT = 1;
    public final static int ORIENTATION_LANDSCAPE = 2;
    public final static int LAYOUT_DEFAULT = 1;
    public final static int LAYOUT_HIVE = 2;
    public final static int THEME1 = 1;
    public final static int THEME2 = 2;
    public final static double layoutHeights[] = {46.61, 50.99, 56.27, 62.78, 70.98};
    public final static double smallLayoutHeight = 46.06;
    public final static double bigLayoutHeight = 61.41;
    public final static double layoutHeightsLandscape[] = {40.72, 44.55, 49.16, 54.84, 62.01};
    public final static double smallLayoutHeightLandscape = 57.59;
    public final static double bigLayoutHeightLandscape = 57.59;
    private final static float PORTRAIT_HEIGHT = 387f;
    private final static float PORTRAIT_WIDTH = 200f;
    public static int isTablet;
    public final double HEIGHT_THRESHOLD_LOWER = 3;
    public final double HEIGHT_THRESHOLD_UPPER = 5;
    public final double MIN_AVAILABLE_HEIGHT = 0.6;
    public final double RECO_HEIGHT = 2.65;
    public final int HEX_LAYOUT_COUNT = 5;
    public float width, height, ydpi, xdpi, density;
    public int currentOrientation;
    RelativeLayout.LayoutParams params;
    private boolean isDefault = false;
    private boolean isEnabled = false;
    private TextView instructionTextView, showKBSize, shortest, tallest, recommended;
    private RadioGroup radioGroup, layoutradioGroup;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private boolean inEnglish = false;
    private CoordinatorLayout layout;
    private Button rateus, fblikeus, trykeyboard, fblike, tapaatap_btn;
    private TextView doYouLikeTextView;

    public static int readPhoneSize(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE) {
            return SettingsActivity.SCREENSIZE_ATLEAST_LARGE;
        } else {
            return SettingsActivity.SCREENSIZE_SMALL_NORMAL;
        }
    }

    public static String getLayoutName(int layoutNum) {
        switch (layoutNum) {
            case SettingsActivity.LAYOUT_HIVE:
                return "hex_";
            case SettingsActivity.LAYOUT_DEFAULT:
            default:
                return "rect_";
        }
    }

    public static String getScreenSizeName(int screenNum) {
        switch (screenNum) {
            case SettingsActivity.SCREENSIZE_ATLEAST_LARGE:
                return "phone";
            case SettingsActivity.SCREENSIZE_SMALL_NORMAL:
                return "tablet";
        }
        return "phone";
    }

    public static String getLayoutHeightName(int layoutName, int heightNum) {
        switch (layoutName) {
            case SettingsActivity.LAYOUT_HIVE:
                return "_" + Integer.toString(Math.abs(4 - heightNum) + 1);
            case SettingsActivity.LAYOUT_DEFAULT:
                return "";
        }
        return "";
    }

    public static String getThemeName(int themeNum) {
        switch (themeNum) {
            case SettingsActivity.THEME1:
                return "themea";
            case SettingsActivity.THEME2:
                return "themeb";
        }
        return "themea";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        if (getIntent().getExtras() != null) {
            inEnglish = getIntent().getExtras().getBoolean("inEnglish", false);
        }

        layout = (CoordinatorLayout) getLayoutInflater().inflate(R.layout.settings_layout, null);
        instructionTextView = (TextView) layout.findViewById(R.id.instruction);
        radioGroup = (RadioGroup) layout.findViewById(R.id.layoutRadioGroup);
        rateus = (Button) layout.findViewById(R.id.rateus);
        doYouLikeTextView = (TextView) layout.findViewById(R.id.likeus);
        tapaatap_btn = (Button) layout.findViewById(R.id.tapaatap_button);
        fblikeus = (Button) layout.findViewById(R.id.fb_likeus);
        trykeyboard = (Button) layout.findViewById(R.id.tryit);
        showKBSize = (TextView) layout.findViewById(R.id.showKBSize);

        params = new RelativeLayout.LayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        width = 0; height = 0; ydpi = 0; xdpi = 0; density = 0;

        RadioButton smallRadio = (RadioButton) layout.findViewById(R.id.smallRadioButton);
        RadioButton bigRadio = (RadioButton) layout.findViewById(R.id.bigRadioButton);
        RadioButton hexRadio = (RadioButton) layout.findViewById(R.id.hexRadioButton);
        layoutradioGroup = (RadioGroup) layout.findViewById(R.id.layoutSizeRadioGroup);

        String smallRadioText = getStringResourceByName("settings_layout_small");
        String bigRadioText = getStringResourceByName("settings_layout_big");
        String hexRadioText = getStringResourceByName("settings_layout_hex");
        fblike = (Button) layout.findViewById(R.id.fb_likeus_tv2);

        FloatingActionButton langButton = (FloatingActionButton) layout.findViewById(R.id.toggleLanguage_settings);
        if (inEnglish) {
            langButton.setImageResource(R.drawable.marathi);
        } else {
            langButton.setImageResource(R.drawable.english);
        }

        String fb_label = getStringResourceByName("fb_likeus");
        fblike.setText(fb_label);
        smallRadio.setText(smallRadioText);
        bigRadio.setText(bigRadioText);
        hexRadio.setText(hexRadioText);

        String tryit_tv = getStringResourceByName("tryit");
        trykeyboard.setText(tryit_tv);
        String instruction = getStringResourceByName("settings_instruction");
        instructionTextView.setText(instruction);
        String doyoulikeustext = getStringResourceByName("do_you_like");
        String rateustext = getStringResourceByName("rate_us");
        String tapaatap_download = getStringResourceByName("tapaatap_download");
        doYouLikeTextView.setText(doyoulikeustext);
        rateus.setText(rateustext);
        tapaatap_btn.setText(tapaatap_download);

        layoutradioGroup.setVisibility(View.VISIBLE);
        setContentView(layout);
        checkKeyboardStatus();

        isTablet = readPhoneSize(this);
        prefs = UserSettings.getPrefs();

        String layoutPrefKey = getResources().getString(R.string.layout);
        String screensizePrefKey = getResources().getString(R.string.layout_screensize);
        final String kbHeight = getResources().getString(R.string.layout_height);

        int size = prefs.getInt(screensizePrefKey, SettingsActivity.SCREENSIZE_ATLEAST_LARGE);
        int layoutType = prefs.getInt(layoutPrefKey, SettingsActivity.LAYOUT_HIVE);

        editor = prefs.edit();
        if (!(prefs.contains(kbHeight))) {
            int temp = getRecommendedHeight();
            editor.putInt(kbHeight, temp);
            editor.apply();
        }
        final int kbHeightSetting = prefs.getInt(kbHeight, getRecommendedHeight());

        switch (layoutType) {
            case SettingsActivity.LAYOUT_HIVE:
                smallRadio.setChecked(false);
                bigRadio.setChecked(false);
                hexRadio.setChecked(true);
                layoutradioGroup.setVisibility(View.VISIBLE);
                ((RadioButton) layoutradioGroup.getChildAt(kbHeightSetting)).setChecked(true);

                DisplayMetrics metrics = getResources().getDisplayMetrics();
                int iconWidth, iconHeight;

                switch (currentOrientation) {
                    case ORIENTATION_PORTRAIT:
                        iconWidth = (int) Math.round((metrics.widthPixels * 0.9) / 5);
                        iconHeight = (int) ((iconWidth / PORTRAIT_WIDTH) * PORTRAIT_HEIGHT);
                        layoutradioGroup.getChildAt(0).setBackgroundResource(R.drawable.radio_size1);
                        layoutradioGroup.getChildAt(0).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(1).setBackgroundResource(R.drawable.radio_size2);
                        layoutradioGroup.getChildAt(1).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(2).setBackgroundResource(R.drawable.radio_size3);
                        layoutradioGroup.getChildAt(2).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(3).setBackgroundResource(R.drawable.radio_size4);
                        layoutradioGroup.getChildAt(3).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(4).setBackgroundResource(R.drawable.radio_size5);
                        layoutradioGroup.getChildAt(4).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        break;
                    case ORIENTATION_LANDSCAPE:
                        iconWidth = (int) Math.round((metrics.widthPixels * 0.9) / 5);
                        iconHeight = (int) ((iconWidth / PORTRAIT_HEIGHT) * PORTRAIT_WIDTH);
                        layoutradioGroup.getChildAt(0).setBackgroundResource(R.drawable.radio_size1_landscape);
                        layoutradioGroup.getChildAt(0).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(1).setBackgroundResource(R.drawable.radio_size2_landscape);
                        layoutradioGroup.getChildAt(1).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(2).setBackgroundResource(R.drawable.radio_size3_landscape);
                        layoutradioGroup.getChildAt(2).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(3).setBackgroundResource(R.drawable.radio_size4_landscape);
                        layoutradioGroup.getChildAt(3).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        layoutradioGroup.getChildAt(4).setBackgroundResource(R.drawable.radio_size5_landscape);
                        layoutradioGroup.getChildAt(4).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                        break;
                }
                break;

            case SettingsActivity.LAYOUT_DEFAULT:
            default:
                switch (size) {
                    case SettingsActivity.SCREENSIZE_ATLEAST_LARGE:
                        layoutradioGroup.setVisibility(View.GONE);
                        smallRadio.setChecked(false);
                        bigRadio.setChecked(true);
                        hexRadio.setChecked(false);
                        break;
                    case SettingsActivity.SCREENSIZE_SMALL_NORMAL:
                    default:
                        layoutradioGroup.setVisibility(View.GONE);
                        smallRadio.setChecked(true);
                        bigRadio.setChecked(false);
                        hexRadio.setChecked(false);
                        break;
                }
                break;
        }

        rateus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rate = new Intent(Intent.ACTION_VIEW);
                rate.setData(Uri.parse("https://play.google.com/store/apps/details?id=iit.android.swarachakraMarathi"));
                startActivity(rate);
            }
        });

        tapaatap_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rate = new Intent(Intent.ACTION_VIEW);
                rate.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.tapaatap"));
                startActivity(rate);
            }
        });

        OnClickListener changeLanguage = new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inEnglish = !inEnglish;
                    setCorrectText();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        OnClickListener goToFBPage = new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent rate = new Intent(Intent.ACTION_VIEW);
                    rate.setData(Uri.parse("fb://facewebmodal/f?href=swarchakra"));
                    startActivity(rate);
                } catch (Exception e) {
                    Intent rate = new Intent(Intent.ACTION_VIEW);
                    rate.setData(Uri.parse("https://www.facebook.com/swarchakra"));
                    startActivity(rate);
                }
            }
        };

        fblike.setOnClickListener(goToFBPage);

        trykeyboard.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent rate = new Intent(getApplicationContext(), iit.android.settings.PreviewActivity.class);
                    rate.putExtra("title", getStringResourceByName("back"));
                    rate.putExtra("inEnglish", inEnglish);
                    startActivity(rate);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        OnCheckedChangeListener radioGroupOnCheckedChangeListener = new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                editor = prefs.edit();
                String layoutKey = getResources().getString(R.string.layout);
                String screensizeKey = getResources().getString(R.string.layout_screensize);
                String kbHeightKey = getResources().getString(R.string.layout_height);
                int kbHeightSetting = prefs.getInt(kbHeightKey, getRecommendedHeight());

                if (checkedId == R.id.bigRadioButton) {
                    editor.putInt(layoutKey, SettingsActivity.LAYOUT_DEFAULT);
                    editor.putInt(screensizeKey, SettingsActivity.SCREENSIZE_ATLEAST_LARGE);
                    editor.commit();
                    layoutradioGroup.setVisibility(View.GONE);
                } else if (checkedId == R.id.smallRadioButton) {
                    editor.putInt(layoutKey, SettingsActivity.LAYOUT_DEFAULT);
                    editor.putInt(screensizeKey, SettingsActivity.SCREENSIZE_SMALL_NORMAL);
                    editor.commit();
                    layoutradioGroup.setVisibility(View.GONE);
                } else {
                    editor.putInt(layoutKey, SettingsActivity.LAYOUT_HIVE);
                    editor.putInt(screensizeKey, SettingsActivity.SCREENSIZE_ATLEAST_LARGE);
                    editor.commit();
                    layoutradioGroup.setVisibility(View.VISIBLE);
                    ((RadioButton) layoutradioGroup.getChildAt(kbHeightSetting)).setChecked(true);
                    Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                    startActivity(intent);
                }
            }
        };
        radioGroup.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener);

        OnCheckedChangeListener layoutSizeChangedListener = new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (group.getVisibility() != View.VISIBLE) return;
                String kbHeightKey = getResources().getString(R.string.layout_height);
                editor = prefs.edit();
                try {
                    RadioButton v = (RadioButton) group.findViewById(checkedId);
                    int index = group.indexOfChild(v);
                    editor.putInt(kbHeightKey, index);
                    editor.commit();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        layoutradioGroup.setOnCheckedChangeListener(layoutSizeChangedListener);
        langButton.setOnClickListener(changeLanguage);

        if (isDefault && isEnabled) {
            isTablet = readPhoneSize(this);
        } else {
            startMainActivity();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getRecommendedHeight();
        String layoutKey = getResources().getString(R.string.layout);
        String kbHeightKey = getResources().getString(R.string.layout_height);
        int layoutType = prefs.getInt(layoutKey, SettingsActivity.LAYOUT_HIVE);
        final int kbHeightSetting = prefs.getInt(kbHeightKey, getRecommendedHeight());

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int iconWidth, iconHeight;

        switch (currentOrientation) {
            case ORIENTATION_PORTRAIT:
                iconWidth = (int) Math.round((metrics.widthPixels * 0.9) / 5);
                iconHeight = (int) ((iconWidth / PORTRAIT_WIDTH) * PORTRAIT_HEIGHT);
                layoutradioGroup.getChildAt(0).setBackgroundResource(R.drawable.radio_size1);
                layoutradioGroup.getChildAt(0).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(1).setBackgroundResource(R.drawable.radio_size2);
                layoutradioGroup.getChildAt(1).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(2).setBackgroundResource(R.drawable.radio_size3);
                layoutradioGroup.getChildAt(2).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(3).setBackgroundResource(R.drawable.radio_size4);
                layoutradioGroup.getChildAt(3).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(4).setBackgroundResource(R.drawable.radio_size5);
                layoutradioGroup.getChildAt(4).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                break;
            case ORIENTATION_LANDSCAPE:
                iconWidth = (int) Math.round((metrics.widthPixels * 0.9) / 5);
                iconHeight = (int) ((iconWidth / PORTRAIT_HEIGHT) * PORTRAIT_WIDTH);
                layoutradioGroup.getChildAt(0).setBackgroundResource(R.drawable.radio_size1_landscape);
                layoutradioGroup.getChildAt(0).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(1).setBackgroundResource(R.drawable.radio_size2_landscape);
                layoutradioGroup.getChildAt(1).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(2).setBackgroundResource(R.drawable.radio_size3_landscape);
                layoutradioGroup.getChildAt(2).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(3).setBackgroundResource(R.drawable.radio_size4_landscape);
                layoutradioGroup.getChildAt(3).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                layoutradioGroup.getChildAt(4).setBackgroundResource(R.drawable.radio_size5_landscape);
                layoutradioGroup.getChildAt(4).setLayoutParams(new LinearLayout.LayoutParams(iconWidth, iconHeight));
                break;
        }
    }

    public int getRecommendedHeight() {
        int recoLayout = 0;
        getDeviceSpecs();
        double heights[] = new double[layoutHeights.length];
        if (width > height) {
            currentOrientation = ORIENTATION_LANDSCAPE;
        } else {
            currentOrientation = ORIENTATION_PORTRAIT;
        }
        if (height < HEIGHT_THRESHOLD_LOWER) {
            for (int i = 0; i < layoutHeights.length; i++) {
                heights[i] = height - ((layoutHeights[i] / 100) * height);
            }
            recoLayout = getClosestK(heights, MIN_AVAILABLE_HEIGHT);
        } else {
            for (int i = 0; i < layoutHeights.length; i++) {
                heights[i] = (layoutHeights[i] / 100) * height;
            }
            recoLayout = getClosestK(heights, RECO_HEIGHT);
        }
        return recoLayout;
    }

    public int getClosestK(double[] a, double x) {
        int low = 0;
        int high = a.length - 1;
        if (high < 0) throw new IllegalArgumentException("The array cannot be empty");
        while (low < high) {
            int mid = (low + high) / 2;
            double d1 = Math.abs(a[mid] - x);
            double d2 = Math.abs(a[mid + 1] - x);
            if (d2 <= d1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public void getDeviceSpecs() {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        width = metrics.widthPixels / metrics.xdpi;
        height = metrics.heightPixels / metrics.ydpi;
        ydpi = metrics.ydpi;
        xdpi = metrics.xdpi;
        density = metrics.density;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_language:
                if (!inEnglish) {
                    inEnglish = true;
                    String languageName = getResources().getString(R.string.language_name);
                    int resId = getResources().getIdentifier(languageName + "_" + "menu_language", "string", getPackageName());
                    String title = getResources().getString(resId);
                    item.setTitle(title);
                } else {
                    inEnglish = false;
                    String title = getResources().getString(R.string.menu_language);
                    item.setTitle(title);
                }
                setCorrectText();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public String getStringResourceByName(String aString) {
        String packageName = getPackageName();
        String languageName = getResources().getString(R.string.language_name);
        int resId = getResources().getIdentifier(languageName + "_" + aString, "string", packageName);
        if (inEnglish) resId = 0;
        if (resId == 0) {
            resId = getResources().getIdentifier(aString, "string", packageName);
        }
        return getString(resId);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        checkKeyboardStatus();
        if (!isDefault || !isEnabled) {
            startMainActivity();
        }
    }

    public void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("inEnglish", inEnglish);
        startActivity(intent);
    }

    public void setCorrectText() {
        RadioButton smallRadio = (RadioButton) layout.findViewById(R.id.smallRadioButton);
        RadioButton bigRadio = (RadioButton) layout.findViewById(R.id.bigRadioButton);
        RadioButton hexradio = (RadioButton) layout.findViewById(R.id.hexRadioButton);
        FloatingActionButton langButton = (FloatingActionButton) layout.findViewById(R.id.toggleLanguage_settings);
        Button tryit = (Button) layout.findViewById(R.id.tryit);
        Button fbLikeUs = (Button) layout.findViewById(R.id.fb_likeus_tv2);

        smallRadio.setText(getStringResourceByName("settings_layout_small"));
        bigRadio.setText(getStringResourceByName("settings_layout_big"));
        hexradio.setText(getStringResourceByName("settings_layout_hex"));
        instructionTextView.setText(getStringResourceByName("settings_instruction"));
        doYouLikeTextView.setText(getStringResourceByName("do_you_like"));
        rateus.setText(getStringResourceByName("rate_us"));
        tapaatap_btn.setText(getStringResourceByName("tapaatap_download"));

        if (inEnglish) {
            langButton.setImageResource(R.drawable.marathi);
        } else {
            langButton.setImageResource(R.drawable.english);
        }
        tryit.setText(getStringResourceByName("tryit"));
        fbLikeUs.setText(getStringResourceByName("fb_likeus"));
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public void checkKeyboardStatus() {
        InputMethodManager mgr = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        List<InputMethodInfo> lim = mgr.getEnabledInputMethodList();
        isEnabled = false;
        isDefault = false;
        for (InputMethodInfo im : lim) {
            if (im.getPackageName().equals(getPackageName())) {
                isEnabled = true;
                final String currentImeId = Settings.Secure.getString(getContentResolver(), Settings.Secure.DEFAULT_INPUT_METHOD);
                if (im.getId().equals(currentImeId)) {
                    isDefault = true;
                }
            }
        }
    }
}
