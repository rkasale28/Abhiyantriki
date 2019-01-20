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

public class FragmentPreEvents extends Fragment {
    GridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for Pre-Events Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.posterdesign, "Digital Poster Design Contest", "India Film Project"));
        cards.add(new ModelCard1(R.drawable.kjsceopen, "KJSCE Mumbai Open 2018", "Cubenama & W.C.A."));
        return cards;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pre_events, container, false);

        //Attach adapter to grid view
        gridView = (GridView) v.findViewById(R.id.grid_view);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}

