package com.fusionsapp.nepalikalam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class Splash_Screen extends AppCompatActivity {


    ImageView logo_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        logo_splash =(ImageView) findViewById(R.id.logo_splash);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.anim_splash);

        logo_splash.startAnimation(myanim);

        Thread mythread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);

                    Intent i = new Intent(Splash_Screen.this,MainActivity.class );
                    startActivity(i);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        mythread.start();
    }
}