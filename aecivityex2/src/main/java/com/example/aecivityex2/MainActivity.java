package com.example.aecivityex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnResultAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnResultAct=(Button)findViewById(R.id.btnResultAct);

        btnResultAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1.버튼을 누르면 ResultActivity 로 이동하게 코딩한다.

                //2.데이터를 주고받기 위한 객체인 intent 생성 후 호출할 엑티비티 클래스를 추가한다.
                Intent mIntent = new Intent(getApplicationContext(),ResultActivity.class);
                //3.화면구현을 시작한다.
                startActivity(mIntent);
                //이것은 새로운 엑티비티가 메인엑티비티앞에 덮어씌어진 것임
            }
        });


    }
}
