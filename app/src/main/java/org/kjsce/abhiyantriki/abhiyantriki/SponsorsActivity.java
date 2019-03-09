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
        modelCard2s.add(new ModelCard2(R.drawable.phackathon, "Hackathon Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.pcodecrux, "Codecrux Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.wafer, "Wafer Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.marathimedia, "Marathi Print Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.networking, "Networking Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.entertainment, "Entertainment Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.gifting, "Gifting Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.pdrone, "Drone Racing Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.german, "German Education Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.gadgets, "Gadget Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.wellness, "Wellness Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.robotics, "Robotics Title Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.escape, "Escape Room Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.munch, "Munching Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.audio, "Audio Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.education, "Education and Financing Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.media, "Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.holiday, "Holiday Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.channel, "Channel Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.recycling, "Recycling Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.technical, "Technical Equipment Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.photography, "Photography Gear Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.hindiprint, "Hindi Print Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.vr, "VR Gaming Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.consultation, "Consultation Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.banking, "Banking Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.laser, "Laser Tag Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.foodcoupon, "Food Coupon Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.beverage, "Beverage Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.radio, "Radio Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.fitess, "Fitness Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.workshop, "Workshop Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinetraining, "Online Training Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.pcodeinx, "Code in X Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.other1, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia1, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia2, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia3, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia4, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedi5, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia6, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.messaging, "Messaging Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.competition, "Competition Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia7, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia8, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia9, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia10, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia11, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia12, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia13, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia14, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia15, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.onlinemedia16, "Online Media Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.blog, "Blog Outreach Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.other1, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.other2, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.other3, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.other4, "Other Partner"));
        modelCard2s.add(new ModelCard2(R.drawable.other5, "Other Partner"));
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

