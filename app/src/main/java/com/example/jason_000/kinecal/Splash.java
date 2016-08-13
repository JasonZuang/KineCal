package com.example.jason_000.kinecal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jason_000 on 1/7/2016.
 */
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4B2D73")));
        Thread myThread = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(5000);
                    Intent startMainScreen = new Intent(getApplicationContext(),mainMenu.class);
                    startActivity(startMainScreen);
                    finish();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        };
        myThread.start();


    }
}