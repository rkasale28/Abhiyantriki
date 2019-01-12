package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class AboutActivity extends NavActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom);
        bottomNavigationView.setSelectedItemId(R.id.about);
        bottomNavigationView.getMenu().removeItem(R.id.register);
    }
}
