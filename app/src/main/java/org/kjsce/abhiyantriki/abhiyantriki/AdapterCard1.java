package org.kjsce.abhiyantriki.abhiyantriki;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

//For all tabs in Events Section,Tech Expo,Auto Expo and Speakers
public class AdapterCard1 extends BaseAdapter {
    Context c;
    ArrayList<ModelCard1> modelCard1s;

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

    //For popups in Expos And Speakers Activity
    void showPopup(int layoutResId) {
        final Dialog myDialog;
        myDialog = new Dialog(c);
        myDialog.setContentView(layoutResId);
        TextView txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(c).inflate(R.layout.model_card1, parent, false);
        }

        final ModelCard1 modelCard1 = (ModelCard1) this.getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.img_view);
        TextView ename = (TextView) convertView.findViewById(R.id.ename);
        TextView cname = (TextView) convertView.findViewById(R.id.cname);

        imageView.setImageResource(modelCard1.getImage());
        ename.setText(modelCard1.getEname());

        if (modelCard1.hasCouncilName()) {
            cname.setText(modelCard1.getCname());
        } else {
            cname.setVisibility(View.GONE);
        }

        //For on click events
        convertView.setOnClickListener(new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                //Later use images
                switch (modelCard1.getEname()) {
                    case "PUBG Mobile":
                        intent = new Intent(c, Pubg.class);
                        startActivity(c, intent, null);
                        break;
                    case "Laser Tag":
                        intent = new Intent(c, Laser.class);
                        startActivity(c, intent, null);
                        break;
                    case "Drone Racing":
                        intent = new Intent(c, Drone.class);
                        startActivity(c, intent, null);
                        break;
                    case "Meme Quest":
                        intent = new Intent(c, Meme.class);
                        startActivity(c, intent, null);
                        break;
                    case "Fifa Manager":
                        intent = new Intent(c, Fifa.class);
                        startActivity(c, intent, null);
                        break;
                    case "Counter Strike":
                        intent = new Intent(c, CS.class);
                        startActivity(c, intent, null);
                        break;
                    case "Castle Math":
                        intent = new Intent(c, CastleMath.class);
                        startActivity(c, intent, null);
                        break;
                    case "Digital Poster Design Contest":
                        intent = new Intent(c, PreEvents1.class);
                        startActivity(c, intent, null);
                        break;
                    case "KJSCE Mumbai Open 2018":
                        intent = new Intent(c, PreEvents2.class);
                        startActivity(c, intent, null);
                        break;

                    case "Technical Paper Presentation":
                        intent = new Intent(c, TPP.class);
                        startActivity(c, intent, null);
                        break;

                    case "Technovate":
                        intent = new Intent(c, Technovate.class);
                        startActivity(c, intent, null);
                        break;

                    case "Tech Quiz":
                        intent = new Intent(c, Techquiz.class);
                        startActivity(c, intent, null);
                        break;

                    case "Tech Hunt":
                        intent = new Intent(c, Techhunt.class);
                        startActivity(c, intent, null);
                        break;

                    case "Zero Energy Building":
                        intent = new Intent(c, ZEB.class);
                        startActivity(c, intent, null);
                        break;

                    case "Dr. S. Christopher":
                        showPopup(R.layout.popup_speaker1);
                        break;

                    case "Mr. Vilas Shinde":
                        showPopup(R.layout.popup_speaker2);
                        break;
                    case "Kalam Sat":
                        showPopup(R.layout.popup_tech1);
                        break;
                    case "Mini Humanoid Robot/Build My Project":
                        showPopup(R.layout.popup_tech2);
                        break;
                    case "SP Robotics Maker Lab":
                        showPopup(R.layout.popup_tech3);
                        break;
                    case "R2D2":
                        showPopup(R.layout.popup_tech4);
                        break;
                    case "Netra Pro":
                        showPopup(R.layout.popup_tech5);
                        break;
                    case "Sphero sprk+":
                        showPopup(R.layout.popup_tech6);
                        break;
                    case "A1 Chek":
                        showPopup(R.layout.popup_tech7);
                        break;
                    case "Touch B":
                        showPopup(R.layout.popup_tech8);
                        break;
                    case "NKD-POD":
                        showPopup(R.layout.popup_tech9);
                        break;
                    case "Neurosky Puzzlebox Orbit & EEG headsets":
                        showPopup(R.layout.popup_tech10);
                        break;
                    case "Ugears":
                        showPopup(R.layout.popup_tech11);
                        break;
                    case "Super Bikes":
                        showPopup(R.layout.popup_auto1);
                        break;
                    case "Vintage Cars":
                        showPopup(R.layout.popup_auto2);
                        break;
                    default:
                        Toast.makeText(c, modelCard1.ename, Toast.LENGTH_SHORT).show();
                }
            }
        });

        return convertView;
    }

}
