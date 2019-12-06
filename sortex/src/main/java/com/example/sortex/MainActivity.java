package com.example.sortex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNum;
    Button btnInput,btnOutput;
    TextView tvResult;
    int num[] = new int[5];  //1. 배열생성
    int index = 0;  //2. 인덱스 변수 생성
    String result;  //4. 스트링 변수 선언(문자 출력을 위한)
    int tmp; // 5. 임시 변수 선언(소트 알고지름을 위한)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum=(EditText)findViewById(R.id.edtNum);
        btnInput=(Button)findViewById(R.id.btnInput);
        btnOutput=(Button)findViewById(R.id.btnOutput);
        tvResult=(TextView)findViewById(R.id.tvResult);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num[index]=Integer.parseInt(edtNum.getText().toString());   //3. num의 0번째 방에 edtnum으로 받은 문자열을 정수형으로 변환
                index++;
                edtNum.setText("");




            }
        });
        btnOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //6.소트 전 자료 출력
                result="<소트전 자료>\n";
                for (int i = 0; i<num.length; i++) {
                    result+=num[i]+"    ";
                }
                result+="\n";
                //7.소트 알고리즘 수행
                for(int a = 0; a<num.length-1; a++) { //num.length-1 인 이유는 5번째 배열 방이 없기 때문이다.[0][1][2][3][4]
                    for (int b= a+1; b<num.length; b++) {//a+1인 이유는 a의 다음 배열번호와 비교해야 되기 때문이다.
                        if(num[a] > num[b]) {  //Ascending Sort (오름차순 정렬)
                            tmp=num[a];
                            num[a]=num[b];
                            num[b]=tmp;    //  a->b  b->c c->a 대입

                        }
                    }
                }
                //8.소트 후 자료 출력
                result+="<소트후 자료>\n";
                for (int i = 0; i<num.length; i++) {
                    result+=num[i]+"    ";
                }
                tvResult.setText(result);
            }
        });

    }
}
