package com.example.ex10_5;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnActivity2,btnReturn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("SecondActivity");

        btnActivity2=(Button)findViewById(R.id.btnActivity2);
        btnReturn1=(Button)findViewById(R.id.btnReturn1);


        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(mIntent);

            }
        });

        btnReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
