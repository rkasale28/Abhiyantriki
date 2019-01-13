package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentTechExpo extends Fragment {
    ExpandableHeightGridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for TechExpo Section Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.icon, "Kalam Sat", ""));
        cards.add(new ModelCard1(R.drawable.icon, "Mini Humanoid Robot/Build My Project",
                ""));
        cards.add(new ModelCard1(R.drawable.icon, "SP Robotics Maker Lab", ""));
        cards.add(new ModelCard1(R.drawable.icon, "R2D2", ""));
        cards.add(new ModelCard1(R.drawable.icon, "Netra Pro", ""));
        cards.add(new ModelCard1(R.drawable.icon, "Sphero sprk+", ""));
        cards.add(new ModelCard1(R.drawable.icon, "A1 Chek", ""));
        cards.add(new ModelCard1(R.drawable.icon, "Touch B", ""));
        cards.add(new ModelCard1(R.drawable.icon, "NKD-POD", ""));
        cards.add(new ModelCard1(R.drawable.icon, "Neurosky Puzzlebox Orbit & egg headsets",
                ""));
        cards.add(new ModelCard1(R.drawable.icon, "Ugears", ""));
        return cards;
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tech_expo, container, false);

       //Attach adapter to grid view
        gridView = (ExpandableHeightGridView) v.findViewById(R.id.grid_view);
        gridView.setExpanded(true);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}
