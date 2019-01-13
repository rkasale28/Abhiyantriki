package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//For timeline in home section
public class AdapterTimeline extends BaseAdapter {
    Context c;
    ArrayList<ModelTimeline> models;

    public AdapterTimeline(Context c, ArrayList<ModelTimeline> models) {
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
            convertView = LayoutInflater.from(c).inflate(R.layout.model_timeline, parent, false);
        }

        final ModelTimeline m = (ModelTimeline) this.getItem(position);
        TextView year = (TextView) convertView.findViewById(R.id.year);
        TextView content = (TextView) convertView.findViewById(R.id.content);

        year.setText(m.getYear());
        content.setText(m.getContent());

        return convertView;
    }
}
