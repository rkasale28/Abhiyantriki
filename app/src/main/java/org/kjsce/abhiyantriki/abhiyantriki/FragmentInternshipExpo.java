package org.kjsce.abhiyantriki.abhiyantriki;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class FragmentInternshipExpo extends Fragment {
    GridView gridView;
    AdapterInternship internship;

    //Add images for companies in Internship Expo Section
    private ArrayList<ModelInternship> getData(){
        ArrayList<ModelInternship> internships=new ArrayList<ModelInternship>();
        internships.add(new ModelInternship(R.drawable.icon));
        internships.add(new ModelInternship(R.drawable.icon));
        internships.add(new ModelInternship(R.drawable.icon));
        return internships;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_internship_expo,container,false);
        gridView=(GridView) v.findViewById(R.id.grid_view);
        internship=new AdapterInternship(getContext(),getData());
        gridView.setAdapter(internship);
        return v;
    }
}
