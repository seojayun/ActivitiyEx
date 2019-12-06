package com.example.voiceex;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnVoice;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult=(TextView)findViewById(R.id.tvResult);
        btnVoice=(Button)findViewById(R.id.btnVoice);

        btnVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);   //1.암시적 인텐트 호출
                mIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                mIntent.putExtra(RecognizerIntent.EXTRA_PROMPT,"뭐든지 말해봐");
                startActivityForResult(mIntent,50);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {  //2. 받는 onActivityResult 메소드 작성
        if(resultCode==RESULT_OK && requestCode ==50) {
            ArrayList <String> results = data.getStringArrayListExtra(RecognizerIntent.EXTRA_MAX_RESULTS);
            String result = results.get(0);
//            tvResult.setText(result);
            Uri uri = Uri.parse("https://ko.dict.naver.com/#/search?query="+result);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    }
}
