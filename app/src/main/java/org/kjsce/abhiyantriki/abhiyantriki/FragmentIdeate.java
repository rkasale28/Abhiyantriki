package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentIdeate extends Fragment {
    ExpandableHeightGridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for Ideate Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.icon, "Defeating The Mishaps", "State Transport Ministry"));
        cards.add(new ModelCard1(R.drawable.icon, "Reversing Global Warming", "BARC"));
        return cards;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ideate, container, false);

        //Attach adapter to grid view
        gridView = (ExpandableHeightGridView) v.findViewById(R.id.grid_view);
        gridView.setExpanded(true);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}
