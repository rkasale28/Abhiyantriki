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

public class FragmentTechnical extends Fragment {
    GridView gridView;
    AdapterCard1 adapterCard1;

    //Add events for Technical Section
    private ArrayList<ModelCard1> getData() {
        ArrayList<ModelCard1> cards = new ArrayList<ModelCard1>();
        cards.add(new ModelCard1(R.drawable.icon, "Hackathon", "Codecell"));
        cards.add(new ModelCard1(R.drawable.icon, "Crackathon", "Codecell"));
        cards.add(new ModelCard1(R.drawable.icon, "Codecrux", "CSI"));
        cards.add(new ModelCard1(R.drawable.icon, "Code in X", "CSI"));
        cards.add(new ModelCard1(R.drawable.icon, "Keyword Rush", "Codecell"));
        cards.add(new ModelCard1(R.drawable.icon, "CAD Clash", "MESA"));
        cards.add(new ModelCard1(R.drawable.icon, "Chain Reaction", "MESA"));
        cards.add(new ModelCard1(R.drawable.icon, "A-Maze Impossible", "IEEE"));
        cards.add(new ModelCard1(R.drawable.icon, "Escape the Labyrinth", "ISTE"));
        cards.add(new ModelCard1(R.drawable.icon, "Circuit Frenzy", "EESA"));
        cards.add(new ModelCard1(R.drawable.icon, "Follow the Flare", "EESA"));
        cards.add(new ModelCard1(R.drawable.icon, "Tech-Eshi's Castle", "IETE"));
        return cards;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_technical, container, false);

        //Attach adapter to grid view
        gridView = (GridView) v.findViewById(R.id.grid_view);
        adapterCard1 = new AdapterCard1(getContext(), getData());
        gridView.setAdapter(adapterCard1);
        return v;
    }
}
