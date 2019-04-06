package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class NotificationsActivity extends AppCompatActivity {
    AdapterNotifs adapter;
    ListView listView;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return false;
    }

    //Add content for notifications here
    private ArrayList<ModelNotifs> getData(){
        ArrayList<ModelNotifs> modelNotifs=new ArrayList<>();
        modelNotifs.add(new ModelNotifs("Hope to see you at Abhiyantriki 2019 :)","06-Oct-2018","21:32:26"));
        modelNotifs.add(new ModelNotifs("The Wait is Over!! Gates open at 10:00 AM","05-Oct-2018","08:08:22"));
        modelNotifs.add(new ModelNotifs("1 Day to Go","04-Oct-2018","09:20:22"));
        modelNotifs.add(new ModelNotifs("2 Days to Go","03-Oct-2018","09:02:22"));
        modelNotifs.add(new ModelNotifs("3 Days to Go","02-Oct-2018","09:00:20"));
        modelNotifs.add(new ModelNotifs("Last date to register! Hurry Up!","01-Oct-2019","09:02:07"));
        modelNotifs.add(new ModelNotifs("Registrations Open!!!","15-Sep-2018","08:59:22"));
        modelNotifs.add(new ModelNotifs("Registrations would open Tomorrow. Be Ready!!!","14-Sep-2018","16:59:22"));
        modelNotifs.add(new ModelNotifs("Registrations would open on 15 September, 09:00 AM","10-Sep-2018","22:32:10"));
        return modelNotifs;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        listView=(ListView) findViewById(R.id.notifslist);
        adapter=new AdapterNotifs(this,getData());
        listView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}