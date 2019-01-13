package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

//For Internship Expo
public class AdapterInternship extends BaseAdapter {
    Context c;
    ArrayList<ModelInternship> modelInternships;

    public AdapterInternship(Context c, ArrayList<ModelInternship> modelInternships) {
        this.c = c;
        this.modelInternships = modelInternships;
    }

    @Override
    public int getCount() {
        return modelInternships.size();
    }

    @Override
    public Object getItem(int position) {
        return modelInternships.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView=LayoutInflater.from(c).inflate(R.layout.model_internship, parent, false);
        }
        final ModelInternship modelInternship=(ModelInternship) this.getItem(position);
        ImageView img=(ImageView) convertView.findViewById(R.id.image);
        img.setImageResource(modelInternship.getImage());
        return convertView;
    }
}
