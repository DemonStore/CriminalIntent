package com.bsu.mmf.web.losdy.criminalintent;

import android.app.Activity;
import android.app.Fragment;

/**
 * Created by DemonStore on 24.10.2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected void setupEnv(Activity c) {
        c.setTitle(R.string.crimes_title);
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
