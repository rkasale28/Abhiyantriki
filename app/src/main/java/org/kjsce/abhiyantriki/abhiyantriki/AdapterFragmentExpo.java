package org.kjsce.abhiyantriki.abhiyantriki;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//For fragments in Expos Section
public class AdapterFragmentExpo extends FragmentPagerAdapter {
    public AdapterFragmentExpo(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        //To instantiate the fragment
        switch (i){
            case 0:return new FragmentTechExpo();
            case 1:return new FragmentAutoExpo();
            case 2:return new FragmentInternshipExpo();
        }
        return null;
    }

    @Override
    public int getCount() {
        //Show total no. of pages
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Tech Expo";
            case 1:return "Auto Expo";
            case 2:return "Internship Expo";
        }
        return null;
    }
}
