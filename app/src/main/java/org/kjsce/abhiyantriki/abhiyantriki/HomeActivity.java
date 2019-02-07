package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends NavActivity{
    AdapterFlagship flagship;
    ViewPager viewPager;
    TabLayout tabLayout;

   //Press back twice to exit
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    //For inserting elements in ImageSlider
    private ArrayList<ModelFlagship> getFData() {
        ArrayList<ModelFlagship> flagshipModels = new ArrayList<>();
        flagshipModels.add(new ModelFlagship(R.drawable.logo, "PUBG Mobile", "Student Council"));
        flagshipModels.add(new ModelFlagship(R.drawable.logo, "Laser Tag", "Student Council"));
        flagshipModels.add(new ModelFlagship(R.drawable.logo, "Drone Racing", "Drona Aviation"));
        return flagshipModels;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //For image slider
        viewPager = (ViewPager) findViewById(R.id.pager);
        flagship = new AdapterFlagship(this, getFData());
        viewPager.setAdapter(flagship);

        //For adding CirclePageIndicator at bottom images in slider
        tabLayout=(TabLayout) findViewById(R.id.indicator);
        tabLayout.setupWithViewPager(viewPager);

    }

}
