package com.example.lab2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.*;
import android.content.Intent;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = new Intent();
        String str = intent.getStringExtra("message");
        textView2.setText("Hello" + str);
    }
}
