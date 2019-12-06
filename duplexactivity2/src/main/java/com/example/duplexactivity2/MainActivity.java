package com.example.duplexactivity2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1,edtNum2;
    Button btnAddActivity;
    RadioButton rdo1,rdo2,rdo3,rdo4;
    RadioGroup rdoG;
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
        rdoG=(RadioGroup)findViewById(R.id.rdoG);
        btnAddActivity=(Button)findViewById(R.id.btnAddActivity);

        btnAddActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mIntent = new Intent(getApplicationContext(),AddActivity.class);
                mIntent.putExtra("Num1",Integer.parseInt(edtNum1.getText().toString()));
                mIntent.putExtra("Num2",Integer.parseInt(edtNum2.getText().toString()));
                //방법3
                mIntent.putExtra("Symbol",rdoG.getCheckedRadioButtonId());
                //방법3





//                switch (rdoG.getCheckedRadioButtonId()) {
//                    case R.id.rdo1 :
//                        mIntent.putExtra("Calo",1);
//                        break;
//                    case R.id.rdo2 :
//                        mIntent.putExtra("Calo",2);
//                        break;
//                    case R.id.rdo3 :
//                        mIntent.putExtra("Calo",3);
//                        break;
//                    case R.id.rdo4 :
//                        mIntent.putExtra("Calo",4);
//                        break;
//                }    //방법2




//                switch (rdoG.getCheckedRadioButtonId()) {
//                    case R.id.rdo1 :
//                        mIntent.putExtra("Symbol","+");
//                        break;
//                    case R.id.rdo2 :
//                        mIntent.putExtra("Symbol","-");
//                        break;
//                    case R.id.rdo3 :
//                        mIntent.putExtra("Symbol","*");
//                        break;
//                    case R.id.rdo4 :
//                        mIntent.putExtra("Symbol","/");
//                        break;
//                }
                startActivityForResult(mIntent,0);

            }
        });
    }


}
