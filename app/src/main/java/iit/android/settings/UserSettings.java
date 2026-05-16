package iit.android.settings;

import iit.android.swarachakra.R;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.preference.PreferenceFragmentCompat;

/**
 * Modernised: replaced deprecated android.preference.PreferenceFragment
 * with androidx.preference.PreferenceFragmentCompat.
 */
public class UserSettings extends PreferenceFragmentCompat {
    private static SharedPreferences prefs;
    SharedPreferences.Editor editor;

    public static SharedPreferences getPrefs() {
        return prefs;
    }

    public static void setPrefs(SharedPreferences prefs) {
        UserSettings.prefs = prefs;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings, rootKey);
        SharedPreferences settings = getPreferenceManager().getSharedPreferences();
        prefs = settings;
        editor = settings.edit();

        String layout = this.getResources().getString(R.string.layout);
        String screensize = this.getResources().getString(R.string.layout_screensize);

        boolean isFirstRun = settings.getBoolean("is_first_run", true);
        if (isFirstRun) {
            editor.putBoolean("is_first_run", false);
            editor.putInt(layout, SettingsActivity.LAYOUT_HIVE);
            editor.putInt(screensize, SettingsActivity.isTablet);
            Log.d("settings", "" + prefs.getInt(screensize, 0));
            editor.commit();
        }
    }
}
