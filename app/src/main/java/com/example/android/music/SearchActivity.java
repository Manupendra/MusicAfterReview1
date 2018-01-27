package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        TextView search = (TextView) findViewById(R.id.search_text);
        search.setText("Here, in this Activity a search bar is maintain for user.");
    }
}
