package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends NavActivity {
    ViewPager viewPager;
    AdapterFlagship adapterf;
    TabLayout indicator;
    ListView listView;
    AdapterTimeline adaptert;

    //Insert elements in ImageSlider
    private ArrayList<Flagship_Model> getFData(){
        ArrayList<Flagship_Model> modelArrayList=new ArrayList<>();
        modelArrayList.add(new Flagship_Model(R.drawable.logo,"PUBG Mobile","Student Council"));
        modelArrayList.add(new Flagship_Model(R.drawable.logo,"Laser Tag","Student Council"));
        modelArrayList.add(new Flagship_Model(R.drawable.logo,"Drone Racing","Drona Aviation"));
        return modelArrayList;
    }

    //Insert elements in timeline
    private ArrayList<Timeline_Model> getTData(){
        ArrayList<Timeline_Model> timelineModels=new ArrayList<>();
        timelineModels.add(new Timeline_Model("1998",getString(R.string.year_98)));
        timelineModels.add(new Timeline_Model("2008",getString(R.string.year_08)));
        timelineModels.add(new Timeline_Model("2009",getString(R.string.year_09)));
        timelineModels.add(new Timeline_Model("2014",getString(R.string.year_14)));
        timelineModels.add(new Timeline_Model("2016",getString(R.string.year_16)));
        timelineModels.add(new Timeline_Model("2017",getString(R.string.year_17)));
        return timelineModels;
    }

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //For sliding images
        viewPager=(ViewPager) findViewById(R.id.pager);
        indicator=(TabLayout) findViewById(R.id.indicator);
        indicator.setupWithViewPager(viewPager,true);
        adapterf=new AdapterFlagship(this,getFData());
        viewPager.setAdapter(adapterf);

        //For timeline
        listView=(ListView) findViewById(R.id.listView);
        adaptert=new AdapterTimeline(this,getTData());
        listView.setAdapter(adaptert);

        listView.setOnTouchListener(new View.OnTouchListener() {
            // Setting on Touch Listener for handling the touch inside ScrollView
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });

        //set Height of list view dynamically
        setListViewHeightBasedOnChildren(listView);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom);
        //For highlighting home button
        bottomNavigationView.setSelectedItemId(R.id.home);
        //For hiding register button
        bottomNavigationView.getMenu().removeItem(R.id.register);

    }


}
