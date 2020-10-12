package com.dimuthu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2 , mail;
    TextView txt;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail =findViewById(R.id.sendEmail);

        Intent email = new Intent(Intent.ACTION_SEND);
        email.setData(Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"Dimuthuasela2013@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT,"Sample subject");
        email.putExtra(Intent.EXTRA_TEXT,"Hi, this is androide app to send to email");
        email.setType("message/rfc@22");

        final Intent Chooser = Intent.createChooser(email,"Email sending app");

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Chooser);
            }
        });



        btn=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        txt=findViewById(R.id.txt1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("It's Done");
            }
        }
        );

        Intent ch = getIntent();
        String myName = ch.getStringExtra("USER_NAME");
        txt.setText(myName);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
            }
        });
    }
}