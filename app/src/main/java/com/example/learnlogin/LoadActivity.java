package com.example.learnlogin;
//14-08-2019
//10116183
//Abdul Karim Malik Amaruloh
//IF4

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import io.realm.Realm;
import io.realm.RealmResults;

public class LoadActivity extends AppCompatActivity {
    Realm realm;
    EditText nim, nama, alamat,telepon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        TextView textView = (TextView)findViewById(R.id.textView);
        Realm realm = Realm.getDefaultInstance();
        RealmResults <User> results1 = realm.where(User.class).findAll();
        String text= "";


        for (User c:results1){

            text = text+c.getUnder()+"\n";
            text = text+c.getNim()+"\n";
            text = text+c.getNama()+"\n";
            text = text+c.getAlamat()+"\n";
            text = text+c.getTelepon()+"\n";
            text = text+c.getEmail()+"\n";
            text = text+c.getSosmed()+"\n";
            text = text+c.getUnder()+"\n";





        }
        textView.setText(text);

    }
}
