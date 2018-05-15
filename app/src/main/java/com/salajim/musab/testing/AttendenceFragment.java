package com.salajim.musab.testing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttendenceFragment extends Fragment implements View.OnClickListener {
    @Bind(R.id.present)
    Button mPresent;
    @Bind(R.id.late) Button mLate;
    @Bind(R.id.apsent) Button mApsent;


    public AttendenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attendence, container, false);
        ButterKnife.bind(this, view);

        mPresent.setOnClickListener(this);
        mLate.setOnClickListener(this);
        mApsent.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }

}
