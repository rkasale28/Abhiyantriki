package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentAutoExpo extends Fragment {
    ExpandableHeightGridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for AutoExpo Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.autobike, "Super Bikes", ""));
        cards.add(new ModelCard1(R.drawable.vintagecars, "Vintage Cars", ""));
        return cards;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_auto_expo, container, false);

        //Attach adapter to grid view
        gridView = (ExpandableHeightGridView) v.findViewById(R.id.grid_view);
        gridView.setExpanded(true);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}