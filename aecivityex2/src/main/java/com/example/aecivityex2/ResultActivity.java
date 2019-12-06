package com.example.aecivityex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//aecivittex2 오른쪽마우스 클릭 ->  new -> activity -> empty activity  하면 짝궁을 이루는 xml을 자동적으로 같이 생성해주며, Manifest.xml에도 자동적으로 문구를 추가해준다. (책 392p~396p내용에서 발전됨)

public class ResultActivity extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnReturn=(Button)findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //4. 두번째 엑티비티 화면을 종료하는 버튼 구성하였다.
                finish();
            }
        });


    }
}
