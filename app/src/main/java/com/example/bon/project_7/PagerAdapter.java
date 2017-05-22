package com.example.bon.project_7;

/**
 * Created by kdh on 2017-04-10.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FragmentMatching tab1 = new FragmentMatching();
                return tab1;
            case 1:
                FragmentWork tab2 = new FragmentWork();
                return tab2;
            case 2:
                FragmentSchedule tab3 = new FragmentSchedule();
                return tab3;
            case 3:
                FragmentCamera tab4 = new FragmentCamera();
                return tab4;
            case 4:
                TabFragment5 tab5 = new TabFragment5();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
