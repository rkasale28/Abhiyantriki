package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class ReachUs extends NavActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reach_us);

        BottomNavigationView bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottom);
        //Highlight Reach Us button
        bottomNavigationView.setSelectedItemId(R.id.reach);
    }
}
