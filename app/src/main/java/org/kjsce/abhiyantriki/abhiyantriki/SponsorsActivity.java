package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

public class SponsorsActivity extends NavActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom);
        bottomNavigationView.getMenu().removeItem(R.id.register);
    }
}
