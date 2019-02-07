package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
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
        cards.add(new ModelCard1(R.drawable.icon, "Dr. S. Christopher", ""));
        cards.add(new ModelCard1(R.drawable.icon, "Mr. Vilas Shinde", ""));
        return cards;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers);

        //For instantiating grid view
        gridView=(ExpandableHeightGridView) findViewById(R.id.grid_view);
        adapterCard1 =new AdapterCard1(this,getData());
        gridView.setAdapter(adapterCard1);

    }
}
