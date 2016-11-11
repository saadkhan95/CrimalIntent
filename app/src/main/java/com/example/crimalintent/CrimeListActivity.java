package com.example.crimalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shahid on 11/10/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
