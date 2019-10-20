package com.example.team46;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RobortProfile extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robort_profile);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.name_id);

        // load anim to textview and imageView
        fadeSlide();
    }

    public void fadeSlide() {
        Animation mAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_slide);
        imageView.startAnimation(mAnimation);
        textView.startAnimation(mAnimation);

    }


}
