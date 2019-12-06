package com.example.ex_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    ImageButton imgbtn1;
    LinearLayout linear1, linear2;


    ImageButton ivButton1_1, ivButton1_2, ivButton2_1, ivButton2_2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent mIntent = new Intent(getApplicationContext(), spActivity.class);
        startActivity(mIntent);


        edt1 = (EditText) findViewById(R.id.edt1);
        imgbtn1 = (ImageButton) findViewById(R.id.imgbtn1);
        ivButton1_1 = (ImageButton) findViewById(R.id.ivButton1_1);
        ivButton1_2 = (ImageButton) findViewById(R.id.ivButton1_2);
        ivButton2_1 = (ImageButton) findViewById(R.id.ivButton2_1);
        ivButton2_2 = (ImageButton) findViewById(R.id.ivButton2_2);
//        linear2 = (LinearLayout) findViewById(R.id.linear2);







        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(mIntent);



            }
        });
        ivButton1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.mlb.com");
                Intent mIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(mIntent);

            }
        });

        ivButton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://sports.news.naver.com/wbaseball/index.nhn");
                Intent mIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(mIntent);
            }
        });



    }

}
