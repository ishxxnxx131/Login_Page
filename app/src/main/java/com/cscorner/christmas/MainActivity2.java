package com.cscorner.christmas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button b1, b2, b3;
    EditText ed1, ed2;
    TextView fp, re;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        fp = findViewById(R.id.fp);
        re = findViewById(R.id.re);
        b3 = findViewById(R.id.b3);

        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //forget password activity

            }
        });

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //register activity
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Login button
            }
        });


    }
}