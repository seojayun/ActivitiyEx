package com.example.activityex3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

//    Button btnSecondFinish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //1.버튼을 없애고, 액션바를 이용한 뒤로가기를 만들기
        ActionBar bar = getSupportActionBar();
        bar.setTitle("두번째 엑티비티");
        bar.setIcon(R.drawable.appleblueicon);
        bar.setDisplayShowHomeEnabled(true);  // 2.이 부분을 써 줘야 아이콘이 보인다.
        bar.setDisplayHomeAsUpEnabled(true);// 3. home으로 돌아가는 버튼의 모양이 추가된다.    (<-  이런 모양)   < 교과서에 없는 내용 >



//        btnSecondFinish=(Button)findViewById(R.id.btnSecondFinish);
//
//        btnSecondFinish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

    }

    @Override //4.  onOptionsItemSelected 메소드 추가 < 교과서에 없는 내용 >
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:   // 5. case android.R.id.home: 원래는 보통 xml에 작성했으면, R.id. 불러올이름 을 썼는데 지금은 안드로이드에서 제공해주는 것을 사용한다.  < 교과서에 없는 내용 >
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
