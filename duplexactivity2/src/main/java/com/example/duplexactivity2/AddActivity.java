package com.example.duplexactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddActivity extends AppCompatActivity {

    Button btnReturn;
    int num1,num2,result;
//    String calSymbol;  //기호받을 변수 선언
//    int caio; //방법2

    int simBol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        btnReturn=(Button)findViewById(R.id.btnReturn);
        final Intent gIntent = getIntent();
        num1=gIntent.getIntExtra("Num1",0);
        num2=gIntent.getIntExtra("Num2",0);

        //방법3
        simBol = gIntent.getIntExtra("Symbol",0);

        switch (simBol) {
            case R.id.rdo1:
                result=num1+num2;
                break;
            case R.id.rdo2:
                result=num1-num2;
                break;
            case R.id.rdo3:
                result=num1*num2;
                break;
            case R.id.rdo4:
                result=num1/num2;
                break;
        }





        //방법2
 //       caio=gIntent.getIntExtra("Calo",0);
//        if (caio==1) {
////            result = num1+num2;
////        }else if (caio==2) {
////            result = num1-num2;
////        }else if (caio==3) {
////            result = num1*num2;
////        }else if (caio==4) {
////            result = num1/num2;
////        }   //방법2

//        calSymbol=gIntent.getStringExtra("Symbol");  //문자는 디폴트 값이 없음
//        if (calSymbol.equals("+")) {
//            result=num1 +num2;
//        }else if( calSymbol.equals("-")) {
//            result=num1-num2;
//        }else  if( calSymbol.equals("*")) {
//            result=num1*num2;
//        }else
//            result=num1/num2;

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(),MainActivity.class);
                gIntent.putExtra("Result",result);
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });

    }
}
