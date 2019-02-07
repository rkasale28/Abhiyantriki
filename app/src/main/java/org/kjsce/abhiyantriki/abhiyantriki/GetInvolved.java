package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class GetInvolved extends NavActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_involved);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton floatingActionButton=(FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GetInvolved.this,HomeActivity.class);
                startActivity(intent);
            }        });


        TextView textView1 = (TextView) findViewById(R.id.nominate_exhibitor);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSc4DMVZuZqxFPC9CfKPzRA03tRt-EVGghTcpv3pV638uwT3Pw/viewform";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.partner_exhibitor);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSdYslj2zz-X78UHRyIhb9WVwLHJT3vWfCSnAmOgSxf3dlKnmw/viewform";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
