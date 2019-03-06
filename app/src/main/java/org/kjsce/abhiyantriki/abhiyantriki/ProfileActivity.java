package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends NavActivity {
    private TextView mStatusTextView1;
    private TextView mStatusTextView2;
    Button button;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener1;
    FirebaseAuth.AuthStateListener mAuthListener2;
    Intent intent;

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener1);
        mAuth.addAuthStateListener(mAuthListener2);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mStatusTextView1 = (TextView) findViewById(R.id.status1);
        mStatusTextView2 = (TextView) findViewById(R.id.status2);

        mAuth=FirebaseAuth.getInstance();
        mAuthListener1= new FirebaseAuth.AuthStateListener()
        {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth)
            {
                if(firebaseAuth.getCurrentUser()!=null)
                {
                    mStatusTextView1.setText(firebaseAuth.getCurrentUser().getDisplayName());
                    mStatusTextView2.setText(firebaseAuth.getCurrentUser().getEmail()+"\n");

                }


            }
        };
        button=(Button)findViewById(R.id.toAnimationPage);
        mAuthListener2= new FirebaseAuth.AuthStateListener()
        {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth)
            {
                if(firebaseAuth.getCurrentUser()==null)
                {
                    startActivity(new Intent(ProfileActivity.this,AnimationScreen2.class));
                }
            }
        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
            }
        });


        FloatingActionButton floatingActionButton=(FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,HomeActivity.class);
                startActivity(intent);
            }        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView imageView=(ImageView) findViewById(R.id.facebook);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/kjsceabhiyantriki/?ref=br_rs";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imageView=(ImageView) findViewById(R.id.twitter);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/kjsabhiyantriki?lang=en";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imageView=(ImageView) findViewById(R.id.instagram);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/kjscelive/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imageView=(ImageView) findViewById(R.id.snapchat);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.snapchat.com/add/kjscelive";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imageView=(ImageView) findViewById(R.id.youtube);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/channel/UC7Z32X4uNZ8c31NteK3065g";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imageView=(ImageView) findViewById(R.id.wordpress);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://kjscelive.wordpress.com/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
