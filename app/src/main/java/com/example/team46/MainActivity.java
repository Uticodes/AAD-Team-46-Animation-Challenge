package com.example.team46;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnAbout;
    TextView members;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        members = findViewById(R.id.btn_view_members);
        members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(getApplicationContext(), TeamMembers.class);
             startActivity(intent);
            }
        });

        btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutALCActivity.class);
                startActivity(intent);
            }
        });
    }
}
