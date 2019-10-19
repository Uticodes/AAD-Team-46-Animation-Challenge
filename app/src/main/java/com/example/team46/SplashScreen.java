package com.example.team46;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    public ImageView andelaLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        andelaLogo = findViewById(R.id.andela_logo);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        andelaLogo.setAnimation(rotate);

        scheduleSplashScreen();

    }
    private void scheduleSplashScreen(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 4000);
    }

}
