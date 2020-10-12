package com.dimuthu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button  button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button2 =findViewById(R.id.btnn2);

        final Intent change = new Intent(Activity2.this,MainActivity.class);
        String name = "Dimuthu Abethunga";

        change.putExtra("USER_NAME",name);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(change);
;            }

        });

    }
}