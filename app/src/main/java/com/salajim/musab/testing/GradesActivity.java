package com.salajim.musab.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GradesActivity extends AppCompatActivity {

    android.support.v7.app.ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);

        toolbar = getSupportActionBar();
        toolbar.setTitle("Grades");
    }
}
