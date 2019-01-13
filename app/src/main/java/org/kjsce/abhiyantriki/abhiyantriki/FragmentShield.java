package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class FragmentShield extends Fragment {
    GridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for Shield Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.icon, "Technical Paper Presentation", "Students Council"));
        cards.add(new ModelCard1(R.drawable.icon, "Technovate", "Students Council"));
        cards.add(new ModelCard1(R.drawable.icon, "Tech Quiz", "Students Council"));
        cards.add(new ModelCard1(R.drawable.icon, "Tech Hunt", "Students Council"));
        cards.add(new ModelCard1(R.drawable.icon, "Zero Energy Building", "Students Council"));
        return cards;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_shield, container, false);

        //Attach adapter to grid view
        gridView = (GridView) v.findViewById(R.id.grid_view);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}
