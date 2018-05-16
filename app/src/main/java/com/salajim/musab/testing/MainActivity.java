package com.salajim.musab.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = "MainActivity";
    @Bind(R.id.attendence) Button mAttendence;
    @Bind(R.id.assignments) Button mAssignments;
    @Bind(R.id.courses) Button mCourses;
    @Bind(R.id.grades) Button mGrades;
    @Bind(R.id.schedule) Button mSchedule;
    @Bind(R.id.events) Button mEvents;
    @Bind(R.id.behavior) Button mBehavior;
    @Bind({R.id.fees}) Button mFees;

    android.support.v7.app.ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        toolbar = getSupportActionBar();
        toolbar.setTitle("School Managment");

        mAttendence.setOnClickListener(this);
        mAssignments.setOnClickListener(this);
        mCourses.setOnClickListener(this);
        mGrades.setOnClickListener(this);
        mSchedule.setOnClickListener(this);
        mEvents.setOnClickListener(this);
        mBehavior.setOnClickListener(this);
        mFees.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mAttendence) {
            Intent intent = new Intent(MainActivity.this, AttendenceActivity.class);
            startActivity(intent);
        }
        if(v == mAssignments) {
            Intent intent = new Intent(MainActivity.this, AssignmentsActivity.class);
            startActivity(intent);
        }
        if (v == mCourses) {
            Intent intent = new Intent(MainActivity.this, CoursesActivity.class);
            startActivity(intent);
        }
        if(v == mGrades) {
            Intent intent = new Intent(MainActivity.this, GradesActivity.class);
            startActivity(intent);
        }
        if(v == mSchedule) {
            Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
            startActivity(intent);
        }
        if(v == mBehavior) {
            Intent intent = new Intent(MainActivity.this, BehaviorActivity.class);
            startActivity(intent);
        }
        if(v == mEvents) {
            Intent intent = new Intent(MainActivity.this, EventsActivity.class);
            startActivity(intent);
        }
        if(v == mFees) {
            Intent intent = new Intent(MainActivity.this, FeesActivity.class);
            startActivity(intent);
        }
    }

    // Inflating menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

}
