package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends NavActivity {
    AdapterFlagship flagship;
    ViewPager viewPager;
    TabLayout tabLayout;
    static int currentPage = 0;

    @Override
    protected void onStart() {
        super.onStart();
    }


    //Press back twice to exit
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finishAffinity();
            System.exit(0);
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
        flagshipModels.add(new ModelFlagship(R.drawable.banner_army, "Indian Army", "Tech Expo"));
        flagshipModels.add(new ModelFlagship(R.drawable.schris, "Speakers", "Students Council"));
        flagshipModels.add(new ModelFlagship(R.drawable.banner_hackathon, "Hackathon", "Codecell"));
        flagshipModels.add(new ModelFlagship(R.drawable.banner_tpp, "Technical Paper", "Students Council"));
        flagshipModels.add(new ModelFlagship(R.drawable.banner_pubg, "PUBG Mobile", "Students Council"));
        return flagshipModels;
    }

    private void init() {
        //For image slider
        viewPager = (ViewPager) findViewById(R.id.pager);
        flagship = new AdapterFlagship(this, getFData());
        viewPager.setAdapter(flagship);

        //For adding CirclePageIndicator at bottom images in slider
        tabLayout = (TabLayout) findViewById(R.id.indicator);
        tabLayout.setupWithViewPager(viewPager);

        final int NUM_PAGES = 5;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 5000, 5000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }
}
