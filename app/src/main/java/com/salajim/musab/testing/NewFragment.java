package com.salajim.musab.testing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {
    @Bind(R.id.emptyTextView)
    TextView mEmpty;


    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        ButterKnife.bind(this, view);

        if(savedInstanceState == null) {
            mEmpty.setText("There are no assignments");
        }

        return view;
    }

}
