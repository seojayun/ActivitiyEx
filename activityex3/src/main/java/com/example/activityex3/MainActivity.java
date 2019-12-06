package com.example.activityex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdoG;
    RadioButton btnSecondActivity,btnThirdActivity;
    Button btnActivityResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoG = (RadioGroup)findViewById(R.id.rdoG);
        btnSecondActivity=(RadioButton)findViewById(R.id.btnSecondActivity);
        btnThirdActivity=(RadioButton)findViewById(R.id.btnThirdActivity);
        btnActivityResult=(Button)findViewById(R.id.btnActivityResult);

        btnActivityResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent mIntent;
//                    if(btnSecondActivity.isChecked()==true) {
//                mIntent = new Intent(getApplicationContext(),SecondActivity.class);
//                        startActivity(mIntent);
//
//                    }else if(btnThirdActivity.isChecked()==true) {
//                        mIntent = new Intent(getApplicationContext(),ThirdActivity.class);
//                        startActivity(mIntent);
//
//                    }  // 내가 쓴 정답

              //  풀이 정답

                Intent mIntent=null;
                switch (rdoG.getCheckedRadioButtonId()) {
                    case R.id.btnSecondActivity:
                        mIntent=new Intent(getApplicationContext(),SecondActivity.class);
                        break;
                    case  R.id.btnThirdActivity:
                        mIntent=new Intent(getApplicationContext(),ThirdActivity.class);
                        break;
                }
                    startActivity(mIntent);

               // 풀이 정답


            }
        });



    }
}
