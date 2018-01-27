package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsOfSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_details_of_song.xml layout file
        setContentView(R.layout.activity_details_of_song);

        //Note : for Instructor, I have tried this code of send the message from one activity to other
        //But here in this activity nothing get displayed(details of the song which is send from NowPlayingActivity)

//        Bundle bundle = getIntent().getExtras();
//        String message = bundle.getString("message");
//        TextView details =(TextView) findViewById(R.id.Details);
//        details.setText(message);

         TextView details =(TextView) findViewById(R.id.Details);
         details.setText("\tAlbum: Despacito\n\tSinger: Luis Fonsi\n\t\tDaddy Yankee\n\tMusic:Luis Fonsi\n\tLabel: 2017 Universal Music Latino");
    }



}
