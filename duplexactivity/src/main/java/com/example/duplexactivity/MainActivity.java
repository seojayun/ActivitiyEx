package com.example.duplexactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1,edtNum2;
    Button btnAddActivity;
    RadioButton rdo1,rdo2,rdo3,rdo4;
    ImageView ivr;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1=(EditText)findViewById(R.id.edtNum1);
        edtNum2=(EditText)findViewById(R.id.edtNum2);
        rdo1=(RadioButton)findViewById(R.id.rdo1);
        rdo2=(RadioButton)findViewById(R.id.rdo2);
        rdo3=(RadioButton)findViewById(R.id.rdo3);
        rdo4=(RadioButton)findViewById(R.id.rdo4);
        ivr=(ImageView)findViewById(R.id.ivr);


        btnAddActivity=(Button)findViewById(R.id.btnAddActivity);
        btnAddActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(edtNum1.getText().toString());  //입력된 문자를 받아 정수형 변환
                num2=Integer.parseInt(edtNum2.getText().toString());
                Intent mIntent = new Intent(getApplicationContext(),AddActivity.class);   //1.새로 호출 한 add 엑티비티 정보만 가져옴
                mIntent.putExtra("Num1",num1);  //2.Num1 이라는 곳에 num1에 입력된값을 담는다.
                mIntent.putExtra("Num2",num2);    //2.Num2 이라는 곳에 num2에 입력된값을 담는다.
                startActivityForResult(mIntent,0);  //3.양방향 엑티비티   ->두번째 엑티비티 로 넘어감.
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) { //9.onActivityResult 메소드 호출
        if (resultCode==RESULT_OK && rdo1.isChecked()) {  //requestCode==RESULT_OK 이 의미는 setresult 를 수행하고 왔다는 의미

                int hap = data.getIntExtra("Sum",0);
                Toast.makeText(getApplicationContext(),"결과 : "+hap,Toast.LENGTH_SHORT).show();
                ivr.setImageResource(R.drawable.phanteom);

        }else if(resultCode==RESULT_OK && rdo2.isChecked()) {
            int hap = data.getIntExtra("Bal",0);
            Toast.makeText(getApplicationContext(),"결과 : "+hap,Toast.LENGTH_SHORT).show();
            ivr.setImageResource(R.drawable.pica);
        }else if(resultCode==RESULT_OK && rdo3.isChecked()) {
            int hap = data.getIntExtra("Gab",0);
            Toast.makeText(getApplicationContext(),"결과 : "+hap,Toast.LENGTH_SHORT).show();
            ivr.setImageResource(R.drawable.pica2);
        }else if(resultCode==RESULT_OK && rdo4.isChecked()) {
            float hap = data.getIntExtra("Nan",0);
            Toast.makeText(getApplicationContext(),"결과 : "+hap,Toast.LENGTH_SHORT).show();
            ivr.setImageResource(R.drawable.pica3);
        }
    }
}
