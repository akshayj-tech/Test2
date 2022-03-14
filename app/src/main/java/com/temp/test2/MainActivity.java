package com.temp.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.reactnativecommunity.checkbox.ReactCheckBoxPackage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ReactCheckBoxPackage();
//        ToasterMessage.message(MainActivity.this, "dkhbskd");
    }
}