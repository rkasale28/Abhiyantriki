package org.kjsce.abhiyantriki.abhiyantriki;

import android.app.Activity;
import android.content.Context;
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
        cards.add(new ModelCard1(R.drawable.kalamsat, "Kalam Sat", ""));
        cards.add(new ModelCard1(R.drawable.mini_humanoid, "Mini Humanoid Robot/Build My Project",
                ""));
        cards.add(new ModelCard1(R.drawable.sp_robotics, "SP Robotics Maker Lab", ""));
        cards.add(new ModelCard1(R.drawable.r2d2, "R2D2", ""));
        cards.add(new ModelCard1(R.drawable.netra_pro, "Netra Pro", ""));
        cards.add(new ModelCard1(R.drawable.sphero, "Sphero sprk+", ""));
        cards.add(new ModelCard1(R.drawable.a1_chek, "A1 Chek", ""));
        cards.add(new ModelCard1(R.drawable.touchb, "Touch B", ""));
        cards.add(new ModelCard1(R.drawable.nkd, "NKD-POD", ""));
        cards.add(new ModelCard1(R.drawable.puzzle_orbit, "Neurosky Puzzlebox Orbit & EEG headsets",
                ""));
        cards.add(new ModelCard1(R.drawable.ugears, "Ugears", ""));
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
