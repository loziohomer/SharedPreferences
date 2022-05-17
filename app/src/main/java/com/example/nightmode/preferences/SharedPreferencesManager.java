package com.example.nightmode.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {
    private static final String SHARED_PREF_NAME = "mySharedPref";
    private static final String NIGHT_MODE = "nightMode";

    public static void saveNightModePref(Context context, boolean nightModeOn) {
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putBoolean(NIGHT_MODE, nightModeOn);

        editor.apply();
    }

    public static boolean loadNightModePref(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        boolean savedValue = preferences.getBoolean(NIGHT_MODE, false);
        return savedValue;
    }
}
