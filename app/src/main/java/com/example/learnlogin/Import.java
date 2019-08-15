package com.example.learnlogin;
//14-08-2019
//10116183
//Abdul Karim Malik Amaruloh
//IF4


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.app.Fragment;

public class Import extends Fragment {
    public Import() {
    }

    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.import_main, container, false);

        getActivity().setTitle("PROFILE");

        return view;
    }
}