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

public class FragmentInformals extends Fragment {
    GridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for Informals Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.pubg, "PUBG Mobile", "Students Council"));
        cards.add(new ModelCard1(R.drawable.lasertag, "Laser Tag", "Students Council"));
        cards.add(new ModelCard1(R.drawable.drone, "Drone Racing", "Drona Aviation"));
        cards.add(new ModelCard1(R.drawable.meme, "Meme Quest", "Sahas"));
        cards.add(new ModelCard1(R.drawable.fifa, "Fifa Manager", ""));
        cards.add(new ModelCard1(R.drawable.cs, "Counter Strike", ""));
        cards.add(new ModelCard1(R.drawable.castlemath, "Castle Math", "Emfinity"));
        return cards;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_informals, container, false);

        //Attach adapter to grid view
        gridView = (GridView) v.findViewById(R.id.grid_view);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}
