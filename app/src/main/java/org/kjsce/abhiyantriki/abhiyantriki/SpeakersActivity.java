package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class SpeakersActivity extends NavActivity {
    ExpandableHeightGridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for Speaker Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.schris, "Dr. S. Christopher", ""));
        cards.add(new ModelCard1(R.drawable.shinde, "Mr. Vilas Shinde", ""));
        return cards;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton floatingActionButton=(FloatingActionButton) findViewById(R.id.fabRegister);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfk4SzefjyG5sOUPwqYPplU5qzWq_J7D8YPtkvys4Vd2ZfgHw/closedform";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }        });

        floatingActionButton=(FloatingActionButton) findViewById(R.id.fabHome);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SpeakersActivity.this,HomeActivity.class);
                startActivity(intent);
            }        });

        //For instantiating grid view
        gridView=(ExpandableHeightGridView) findViewById(R.id.grid_view);
        adapterCard1 =new AdapterCard1(this,getData());
        gridView.setAdapter(adapterCard1);

    }
}
