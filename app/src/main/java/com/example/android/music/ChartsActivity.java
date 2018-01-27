package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_charts);

        TextView charts = (TextView) findViewById(R.id.charts_text);
        charts.setText("Here, in this charts activity All the Top Charts songs list will be shown and Top Charts by Country to be Displayed");

    }
}
