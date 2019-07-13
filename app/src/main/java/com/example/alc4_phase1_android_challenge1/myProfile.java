package com.example.alc4_phase1_android_challenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class myProfile extends AppCompatActivity {
    CircleImageView avator;
    TextView textName;
    TextView textTrack;
    TextView textCountry;
    TextView textEmail;
    TextView textNumber;
    TextView textSlackUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        avator = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.profile_image);
        textName=(TextView) findViewById(R.id.profile_name);
        textTrack=(TextView) findViewById(R.id.profile_track);
        textCountry=(TextView) findViewById(R.id.profile_country);
        textEmail=(TextView) findViewById(R.id.profile_email);
        textNumber=(TextView) findViewById(R.id.profile_number);
        textSlackUsername=(TextView) findViewById(R.id.profile_username);
    }
}
