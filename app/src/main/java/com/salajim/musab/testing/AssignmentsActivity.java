package com.salajim.musab.testing;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

public class AssignmentsActivity extends AppCompatActivity{
    private ViewPager mViewPager;
    private SectionsPagerAdapter mAdapter;

    android.support.v7.app.ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
        ButterKnife.bind(this);

        toolbar = getSupportActionBar();
        toolbar.setTitle("Assignments");

        View tabs = findViewById(R.id.tabs);
        ViewCompat.setElevation(tabs, getResources().getDimension(R.dimen.action_bar_elevation));

        mAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new NewFragment(), "New");
        adapter.addFragment(new CompletedFragment(), "Completed");
        adapter.addFragment(new PendingFragment(), "Pending");

        viewPager.setAdapter(adapter);
    }


}
