package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

//For ImageSlider in HomeActivity
public class AdapterFlagship extends PagerAdapter {
    public Context c;
    public ArrayList<ModelFlagship> flagshipEvents;

    public AdapterFlagship(Context c, ArrayList<ModelFlagship> flagshipEvents) {
        this.c = c;
        this.flagshipEvents = flagshipEvents;
    }

    @Override
    public int getCount() {
        return flagshipEvents.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = LayoutInflater.from(c).inflate(R.layout.model_flagship, container, false);

        ModelFlagship f = (ModelFlagship) flagshipEvents.get(position);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        TextView title = (TextView) itemView.findViewById(R.id.title);
        TextView subtitle = (TextView) itemView.findViewById(R.id.subtitle);

        imageView.setImageResource(f.getImage());
        title.setText(f.getTitle());
        subtitle.setText(f.getSubtitle());

        container.addView(itemView);

        /*
        //For handling click events
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, "you clicked image " + (position + 1), Toast.LENGTH_LONG).show();
            }
        });
*/
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}

