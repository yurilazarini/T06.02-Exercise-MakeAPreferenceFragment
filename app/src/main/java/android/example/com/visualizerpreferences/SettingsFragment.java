package android.example.com.visualizerpreferences;

import android.os.Bundle;

/**
 * Created by usuario on 2/13/18.
 */

public class SettingsFragment extends PrefereceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {

        addPreferencesFromResource(R.xml.pref_visualizer);

    }
}
