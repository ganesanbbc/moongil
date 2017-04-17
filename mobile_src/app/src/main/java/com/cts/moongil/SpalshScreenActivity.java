package com.cts.moongil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import moongil.cts.com.moongil.R;

public class SpalshScreenActivity extends AppCompatActivity {

    public static final long SPLASH_TIME_IN_MS = 3000l;
    private Runnable navigationAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeFullscreenmode();
        setContentView(R.layout.activity_spalshscreen);
        Handler hm = new Handler();

        navigationAction = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpalshScreenActivity.this, OnboardingActivity.class);
                startActivity(intent);
            }
        };
        hm.postAtTime(navigationAction, SPLASH_TIME_IN_MS);
    }

    private void makeFullscreenmode() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}
