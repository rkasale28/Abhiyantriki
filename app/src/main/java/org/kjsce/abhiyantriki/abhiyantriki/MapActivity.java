package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class MapActivity extends NavActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout=(FrameLayout) findViewById(R.id.frame);

        LayoutInflater inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View activityView=inflater.inflate(R.layout.activity_map,null,false);

        frameLayout.addView(activityView);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom);
        //For highlighting map
        bottomNavigationView.setSelectedItemId(R.id.map);
    }
}
