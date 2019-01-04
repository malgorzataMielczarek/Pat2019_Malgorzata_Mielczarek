package com.example.malgorzatamielczarek.magorztamielczarek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    Timer timer;
    Boolean isBackPressed = false;
    @Override
    public void onBackPressed(){
        if(isBackPressed){
            super.onBackPressed();
        }
        else {
            isBackPressed = true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(!isBackPressed) {
                    startActivity(new Intent(SplashScreen.this, MainScreen.class));
                    finish();
                }
            }
        }, 5000);
    }
}
