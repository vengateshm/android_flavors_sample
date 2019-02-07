package com.android.flavorssample;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvVersionName = findViewById(R.id.tvVersionName);
        tvVersionName.setText(R.string.version_name);
        tvVersionName.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
    }
}
