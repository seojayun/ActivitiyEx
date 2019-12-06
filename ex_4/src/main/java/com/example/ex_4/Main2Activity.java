package com.example.ex_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ListView listView1;
    MyAdapter adapter;
    Integer posterID[] = {R.drawable.baseballsub,R.drawable.baseballsub,R.drawable.baseballsub,
            R.drawable.baseballsub,R.drawable.baseballsub,R.drawable.baseballsub,R.drawable.baseballsub,R.drawable.baseballsub,R.drawable.baseballsub};
    String title[] = { "2018년도","2017년도","2016년도","2015년도","2014년도","2013년도","2012년도","2011년도","다른 연도 검색"};
    String content[] = {"팀 정보 보기","팀 정보 보기","팀 정보 보기","팀 정보 보기","팀 정보 보기","팀 정보 보기","팀 정보 보기","팀 정보 보기","mlb.mbcsportsplus.com"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        listView1=(ListView)findViewById(R.id.listView1);

        List<TActivity> data = new ArrayList<>();//17.동적 배열 생성
        for(int i = 0; i<posterID.length; i++) { //18.for문 작성
            data.add(new TActivity(posterID[i],title[i],content[i]));  //19.동적배열에 값을 넣는데, 생성하면서 값을 넣는다.(생성자에 3개를 생성햇으므로 3개를 입력하라고 표기된다.)
        }
        adapter=new MyAdapter(this,data);  //20.어뎁터에 값 대입
        listView1.setAdapter(adapter);  //21.리스트뷰에 최종적으로 setAdapter 시킨다.adapter를...




    }
}
