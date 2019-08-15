package com.example.learnlogin;
//14-08-2019
//10116183
//Abdul Karim Malik Amaruloh
//IF4

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Root extends Fragment  {
    public Root(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_main, container, false);

        getActivity().setTitle("Abdul Karim");



        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView nama = view.findViewById(R.id.tv_namaMain);
        Button btn =view.findViewById(R.id.button_logoutMain);

        nama.setText(Preferences.getLoggedInUser(getActivity().getBaseContext()));

        btn.findViewById(R.id.button_logoutMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Menghapus Status login dan kembali ke Login Activity
                Preferences.clearLoggedInUser(getActivity().getBaseContext());
                startActivity(new Intent(getActivity().getBaseContext(),LoginActivity.class));
                getActivity().finish();
            }
        });
    }


}
