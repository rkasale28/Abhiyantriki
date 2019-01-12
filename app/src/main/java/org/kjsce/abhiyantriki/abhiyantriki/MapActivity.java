package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class MapActivity extends NavActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom);
        bottomNavigationView.setSelectedItemId(R.id.map);
        bottomNavigationView.getMenu().removeItem(R.id.register);
    }
}
