package com.example.team46;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    public ImageView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splash = findViewById(R.id.splsh_view);
//        ObjectAnimator animation = ObjectAnimator.ofFloat(splash, "alpha",0.0f, 1.0f);
//        animation.setDuration(1000);
//        animation.start();

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.did);
        splash.setAnimation(myanim);

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}
