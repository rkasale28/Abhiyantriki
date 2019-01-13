package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//For all tabs in Events Section,Tech Expo,Auto Expo and Speakers
public class AdapterCard1 extends BaseAdapter {
    Context c;
    ArrayList <ModelCard1> modelCard1s;

    public AdapterCard1(Context c, ArrayList<ModelCard1> modelCard1s) {
        this.c = c;
        this.modelCard1s = modelCard1s;
    }

    @Override
    public int getCount() {
        return modelCard1s.size();
    }

    @Override
    public Object getItem(int position) {
        return modelCard1s.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView=LayoutInflater.from(c).inflate(R.layout.model_card1,parent,false);
            }

            final ModelCard1 modelCard1 =(ModelCard1) this.getItem(position);
        ImageView imageView=(ImageView) convertView.findViewById(R.id.img_view);
        TextView ename=(TextView) convertView.findViewById(R.id.ename);
        TextView cname=(TextView) convertView.findViewById(R.id.cname);

        imageView.setImageResource(modelCard1.getImage());
        ename.setText(modelCard1.getEname());

        if (modelCard1.hasCouncilName()){
        cname.setText(modelCard1.getCname());
        }
        else {
            cname.setVisibility(View.GONE);
        }

        return convertView;
    }

}
