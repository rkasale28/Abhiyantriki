package org.kjsce.abhiyantriki.abhiyantriki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class AnimationScreen1 extends AppCompatActivity {


    private static int TIME_OUT = 300; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animation_screen1);
        final View myLayout = findViewById(R.id.startabhi);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AnimationScreen1.this, AnimationScreen2.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }

}
