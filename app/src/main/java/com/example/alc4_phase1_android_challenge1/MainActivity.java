package com.example.alc4_phase1_android_challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creating Textview.
    TextView alc;
    // Creating button.
    Button about;
    Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alc = (TextView) findViewById(R.id.alc);
        // Assign button layout ID.
        about = (Button)findViewById(R.id.btn_about_alc);
        profile = (Button)findViewById(R.id.btn_my_profile);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Opening the Login Activity using Intent.
                Intent intent = new Intent(MainActivity.this, aboutALC.class);
                startActivity(intent);

            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Opening the Login Activity using Intent.
                Intent intent = new Intent(MainActivity.this, myProfile.class);
                startActivity(intent);

            }
        });
    }
}
