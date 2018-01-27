package com.example.android.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the home activity
        View home= findViewById(R.id.home_linear_layout_view);

        //Set the Click Listener on that view
        home.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the home bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link HomeActivity}
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);

                //Start the new Activity
                startActivity(homeIntent);
            }
        });

        //Find the view that shows the now Playing activity
        View nowPlaying= findViewById(R.id.now_playing_linear_layout);

        //Set the Click Listener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the Now playing bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlaying = new Intent(MainActivity.this,NowPlayingActivity.class);

                //Start the new Activity
                startActivity(nowPlaying);
            }
        });

        //Find the view that shows the Charts activity
        View charts= findViewById(R.id.charts_linear_layout);

        //Set the Click Listener on that view
        charts.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the charts bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link ChartsActivity}
                Intent chartsIntent = new Intent(MainActivity.this,ChartsActivity.class);

                //Start the new Activity
                startActivity(chartsIntent);
            }
        });

        //Find the view that shows the New Release activity
        View newRelease= findViewById(R.id.new_release_linear_layout);

        //Set the Click Listener on that view
        newRelease.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the New Release bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link ChartsActivity}
                Intent newReleaseIntent = new Intent(MainActivity.this,NewReleaseActivity.class);

                //Start the new Activity
                startActivity(newReleaseIntent);
            }
        });

        //Find the view that shows the Library activity
        View library= findViewById(R.id.library_linear_layout);

        //Set the Click Listener on that view
        library.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the library bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link LibraryActivity}
                Intent libraryIntent = new Intent(MainActivity.this,LibraryActivity.class);

                //Start the new Activity
                startActivity(libraryIntent);
            }
        });

        //Find the view that shows the Search activity
        View search= findViewById(R.id.search_linear_layout);

        //Set the Click Listener on that view
        search.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the search bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this,SearchActivity.class);

                //Start the new Activity
                startActivity(searchIntent);
            }
        });

        //Find the view that shows the Settings activity
        View settings= findViewById(R.id.settings_linear_layout);

        //Set the Click Listener on that view
        settings.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the settings bar is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link SettingsActivity}
                Intent settingsIntent = new Intent(MainActivity.this,SettingsActivity.class);

                //Start the new Activity
                startActivity(settingsIntent);
            }
        });

    }
}
