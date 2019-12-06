package com.example.duplexactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    Button btnReturn;
    int sum,bal,gab, nan;  //5.합을 구할 변수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        btnReturn=(Button)findViewById(R.id.btnReturn);
        Intent gIntent = getIntent();//4. getIntent 로 무엇가를 받는다.
        sum=gIntent.getIntExtra("Num1",0)+gIntent.getIntExtra("Num2",0);  // 6. Num1 Num2 두 수를 받아서 더한값을 받는다.
        bal=gIntent.getIntExtra("Num1",0)-gIntent.getIntExtra("Num2",0);
        gab=gIntent.getIntExtra("Num1",0)*gIntent.getIntExtra("Num2",0);
        nan=gIntent.getIntExtra("Num1",0)/gIntent.getIntExtra("Num2",0);


        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(),MainActivity.class);//7.종료하기전에 outIntent변수 선언 후 메인엑티비티를 담는다.
                outIntent.putExtra("Sum",sum);  //7-1. 합계의 값을 가져온다.
                outIntent.putExtra("Bal",bal);
                outIntent.putExtra("Gab",gab);
                outIntent.putExtra("Nan",nan);
                setResult(RESULT_OK,outIntent); //7.2. RESULT_OK  <- result code.
                finish();  //8.최종적으로 finish();해줘야 첫 화면으로돌아감
            }
        });
    }



}
