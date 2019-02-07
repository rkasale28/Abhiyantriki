package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class SponsorsActivity extends NavActivity {
    AdapterCard2 adapter;
    ExpandableHeightGridView gv;

    //Add Sponsors in Sponsors Section
    private ArrayList<ModelCard2> getData() {
        ArrayList<ModelCard2> modelCard2s = new ArrayList<ModelCard2>();
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Hackathon Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Codecrux Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Wafer Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Marathi Print Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Networking Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Entertainment Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Gifting Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Drone Racing Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "German Education Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Gadget Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Wellness Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Robotics Title Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Escape Room Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Munching Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Audio Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Education and Financing Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Holiday Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Channel Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Recycling Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Technical Equipment Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Photography Gear Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Hindi Print Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "VR Gaming Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Consultation Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Banking Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Laser Tag Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Food Coupon Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Beverage Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Radio Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Fitness Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Workshop Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Training Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Code in X Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Messaging Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Competition Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Blog Outreach Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.icon, "Other Partner"));
        return modelCard2s;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton floatingActionButton=(FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SponsorsActivity.this,HomeActivity.class);
                startActivity(intent);
            }        });


        //Attach adapter to Grid View
        gv = (ExpandableHeightGridView) findViewById(R.id.grid_view);
        gv.setExpanded(true);
        gv.setFocusable(false);
        adapter = new AdapterCard2(this, getData());
        gv.setAdapter(adapter);
        }
}

