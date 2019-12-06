package com.example.activitiyex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button btnResult,btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnResult=(Button)findViewById(R.id.btnResult);
        btnEnd=(Button)findViewById(R.id.btnEnd);
        android.util.Log.i("테스트","onCreate 메소드 수행");
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                        //4. 명시적 Intent(인텐트)                         ▲아직 호출 된 상황은 아님
                startActivity(intent);
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("테스트","onStart 메소드 수행");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("테스트","onResume 메소드 수행");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("테스트","onPause 메소드 수행");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("테스트","onStop 메소드 수행");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i("테스트","onRestart 메소드 수행");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("테스트","onDestroy 메소드 수행");
    }
}
