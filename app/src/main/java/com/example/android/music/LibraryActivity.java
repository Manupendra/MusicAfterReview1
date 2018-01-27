package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_library);

        TextView library = (TextView) findViewById(R.id.library_text);
        library.setText("Here, in this Activity stations list, artists list,album list,Podcast list is shown.");
    }
}
