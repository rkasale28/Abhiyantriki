package org.kjsce.abhiyantriki.abhiyantriki;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//For fragments in Events Section
public class AdapterFragmentEvent extends FragmentPagerAdapter {
    public AdapterFragmentEvent(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        //To instantiate the fragment
        switch (i) {
            case 0:
                return new FragmentTechnical();
            case 1:
                return new FragmentIdeate();
            case 2:
                return new FragmentInformals();
            case 3:
                return new FragmentShield();
            case 4:
                return new FragmentPreEvents();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        //Returns total no. of pages
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Technical";
            case 1:
                return "Ideate";
            case 2:
                return "Informals";
            case 3:
                return "Shield";
            case 4:
                return "Pre-Events";
        }
        return null;
    }
}
