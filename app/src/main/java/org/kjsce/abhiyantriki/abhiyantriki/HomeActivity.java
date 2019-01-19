package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends NavActivity{
    AdapterFlagship flagship;
    AdapterTimeline timeline;
    ViewPager viewPager;
    ListView listView;
    TabLayout tabLayout;

    //Method for Setting the Height of the ListView dynamically.
    //Hack to fix the issue of not showing all the items of the ListView
    //when placed inside a ScrollView
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, AbsListView.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

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

    //For inserting elements in Timeline
    private ArrayList<ModelTimeline> getTData() {
        ArrayList<ModelTimeline> timelineModels = new ArrayList<>();
        timelineModels.add(new ModelTimeline("1998", getString(R.string.year_98)));
        timelineModels.add(new ModelTimeline("2008", getString(R.string.year_08)));
        timelineModels.add(new ModelTimeline("2009", getString(R.string.year_09)));
        timelineModels.add(new ModelTimeline("2014", getString(R.string.year_14)));
        timelineModels.add(new ModelTimeline("2016", getString(R.string.year_16)));
        timelineModels.add(new ModelTimeline("2017", getString(R.string.year_17)));
        return timelineModels;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle(R.string.app_name);

        //For image slider
        viewPager = (ViewPager) findViewById(R.id.pager);
        flagship = new AdapterFlagship(this, getFData());
        viewPager.setAdapter(flagship);

        //For adding CirclePageIndicator at bottom images in slider
        tabLayout=(TabLayout) findViewById(R.id.indicator);
        tabLayout.setupWithViewPager(viewPager);

        //For timeline
        listView = (ListView) findViewById(R.id.listView);
        timeline = new AdapterTimeline(this, getTData());
        listView.setAdapter(timeline);

        listView.setOnTouchListener(new View.OnTouchListener() {
            // Setting on Touch Listener for handling the touch inside ScrollView
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });

        //For setting height of ListView dynamically
        setListViewHeightBasedOnChildren(listView);

        /*BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom);
        //For highlighting home button
        bottomNavigationView.setSelectedItemId(R.id.homeButton);*/
    }

}
