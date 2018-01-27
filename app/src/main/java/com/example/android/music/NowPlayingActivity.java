package com.example.android.music;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    //This String will data to new Activity
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_now_playing.xml layout file
        setContentView(R.layout.activity_now_playing);

        //Find the view when Buy Button is Clicked
        Button buySong = (Button) findViewById(R.id.Buy_Button);

        //Set the Click Listener on that view
        buySong.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when Buy_Button is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link BuyActivity}
                Intent buyIntent = new Intent(NowPlayingActivity.this,BuyActivity.class);

                //Start the new Activity
                startActivity(buyIntent);
            }
        });

        //Find the view that shows the details of the particular song
        View details =  findViewById(R.id.detailsOfSong_relative_layout);

        //Set the Click Listener on that view
        details.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the details Button is clicked on.
            @Override
            public void onClick(View view){
                // Create a new intent to open the {@link DetailsActivity}
                Intent detailsIntent = new Intent(getApplicationContext(),DetailsOfSongActivity.class);

                //Nothing is being send from this activity
                //Here the details are send by NowPlayingActivity to DetailsOfSongActivity like Album,Singer,Music,Label
//                detailsIntent.putExtra("\tAlbum: Despacito\n\tSinger: Luis Fonsi\n\t\tDaddy Yankee\n\tMusic:Luis Fonsi\n\tLabal: 2017 Universal Music Latino",message);
//                Log.v("NowPlayingActivity","Details have been sent ");
//                //Start the new Activity
                startActivity(detailsIntent);
            }
        });

    }

    /**
     * This method will get called when user disliked the song
     * @param view
     */
    public void UserHasDisliked(View view)
    {
        /**
         * This lines of code to Display that user has diliked the song in toast.
         */
        Context context = getApplicationContext();

        CharSequence text = "You have disliked this song";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method will get called when user played previous song
     * @param view
     */
    public void UserHasPlayedPrevious(View view)
    {
        /**
         * This lines of code to Display that User played previous song in toast.
         */
        Context context = getApplicationContext();

        CharSequence text = "Previous song will gonna start";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method will get called when user played next.
     * @param view
     */
    public void UserHasPaused(View view)
    {
        /**
         * This lines of code to Display that user paused in toast.
         */
        Context context = getApplicationContext();

        CharSequence text = "User has pause the song";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        ImageView changeImage=(ImageView) findViewById(R.id.playpause_image);
        changeImage.setImageResource(R.drawable.play);

    }

    /**
     * This method will get called when user played next
     * @param view
     */
    public void UserHasPlayedNext(View view)
    {
        /**
         * This lines of code to Display that user played next in toast.
         */
        Context context = getApplicationContext();

        CharSequence text = "Next Song will gonna start";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This lines of code get executed when user has liked the song
     * @param view
     */
    public void UserHasLiked(View view)
    {
        /**
         * This lines of code to Display that user has liked the song in toast.
         */
        Context context = getApplicationContext();

        CharSequence text = "User has liked the song";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method will get called when download button is clicked
     * @param view
     */
    public void downloadSongButtonClicked(View view)
    {
        /**
         * This lines of code to Display that Downloading is being started in toast after download button pressed.
         */
        Context context = getApplicationContext();

        CharSequence text = "Download started for Despacito Song";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
