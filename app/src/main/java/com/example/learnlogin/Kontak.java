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


public class Kontak extends Fragment {
    public Kontak(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.kontak, container, false);

        getActivity().setTitle("KONTAK");

        return view;
    }
}
