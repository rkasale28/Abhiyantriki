package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//For sponsors
public class AdapterCard2 extends BaseAdapter {
    Context c;
    ArrayList<ModelCard2> modelCard2s;

    public AdapterCard2(Context c, ArrayList<ModelCard2> modelCard2s) {
        this.c = c;
        this.modelCard2s = modelCard2s;
    }

    @Override
    public int getCount() {
        return modelCard2s.size();
    }

    @Override
    public Object getItem(int position) {
        return modelCard2s.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(c).inflate(R.layout.model_card2, parent, false);
        }
        final ModelCard2 model = (ModelCard2) this.getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.company_logo);
        TextView textView = (TextView) convertView.findViewById(R.id.partner);

        imageView.setImageResource(model.getClogo());
        textView.setText(model.getPtype());
        return convertView;
    }
}
