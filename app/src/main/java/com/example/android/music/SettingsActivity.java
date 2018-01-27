package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        TextView settings = (TextView) findViewById(R.id.settings_text);
        settings.setText("Here, in this Settings Activity settings are shown for Playbacks,Devices(Connections),Music Quality,Notifications,About the App.");
    }
}
