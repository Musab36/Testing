package com.salajim.musab.testing;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AttendenceActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.present)
    Button mPresent;
    @Bind(R.id.late) Button mLate;
    @Bind(R.id.apsent) Button mApsent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);
        ButterKnife.bind(this);

        mPresent.setOnClickListener(this);
        mLate.setOnClickListener(this);
        mApsent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Fragment fragment;
        if(view == mPresent) {
            mPresent.setBackgroundColor(getResources().getColor(R.color.red));

            fragment = new PresentFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragments, fragment);
            ft.commit();
        } else {
            mPresent.setBackgroundColor(getResources().getColor(R.color.bg));
        }
        if (view == mLate) {
            mLate.setBackgroundColor(getResources().getColor(R.color.red));


            fragment = new LateFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragments, fragment);
            ft.commit();
        } else {
            mLate.setBackgroundColor(getResources().getColor(R.color.bg));
        }
        if (view == mApsent) {
            mApsent.setBackgroundColor(getResources().getColor(R.color.red));

            fragment = new AbsentFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragments, fragment);
            ft.commit();
        } else {
            mApsent.setBackgroundColor(getResources().getColor(R.color.bg));
        }

    }

    /*
    public void changeFragment(View view) {
        Fragment fragment;

        if(view == findViewById(R.id.present)) {
            fragment = new PresentFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragments, fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.late)) {
            fragment = new LateFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragments, fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.apsent)) {
            fragment = new AbsentFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragments, fragment);
            ft.commit();
        }
    }
    */
}
