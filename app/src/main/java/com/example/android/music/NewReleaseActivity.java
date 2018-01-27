package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewReleaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_release);

        TextView newRelease = (TextView) findViewById(R.id.new_release_text);
        newRelease.setText("Here, in this Activity all the new Songs released based on the dates.");
    }
}
