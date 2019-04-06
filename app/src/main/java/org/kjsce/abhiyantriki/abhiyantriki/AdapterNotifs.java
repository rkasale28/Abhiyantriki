package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterNotifs extends BaseAdapter {
    Context c;
    ArrayList<ModelNotifs> models;

    public AdapterNotifs(Context c, ArrayList<ModelNotifs> models) {
        this.c = c;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(c).inflate(R.layout.model_notifs, parent, false);
        }

        final ModelNotifs m = (ModelNotifs) this.getItem(position);
        TextView cont = (TextView) convertView.findViewById(R.id.content);
        TextView dview = (TextView) convertView.findViewById(R.id.date);
        TextView tview = (TextView) convertView.findViewById(R.id.time);

        cont.setText(m.getContent());
        dview.setText(m.getDate());
        tview.setText(m.getTime());

        return convertView;
    }
}

