package com.example.ex_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<TActivity> itemDataList;
    private LayoutInflater mInflater;

    public MyAdapter(Context context, List<TActivity> itemDataList) {

        this.context=context;
        this.itemDataList=itemDataList;
        this.mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView; // 8.기본적인 정보를 제공해줌
        if(itemView==null) {
            itemView=mInflater.inflate(R.layout.activity_t,null);  //9.item_listview.xml를 인플레이트 시켜 대입

        }
        ImageView ivPoster = (ImageView) itemView.findViewById(R.id.ivSub_1);   //10.itemView. 안에 있음
        TextView tvTitle = (TextView)itemView.findViewById(R.id.tvName);
        TextView tvContent = (TextView)itemView.findViewById(R.id.tvsub);
        TActivity tActivity = itemDataList.get(position);//13. ItemData class의 데이터를 받기 위한 변수 선언(그리드뷰)
        ivPoster.setImageResource(tActivity.getImgID());
        tvTitle.setText(tActivity.getTitle());
        tvContent.setText(tActivity.getContent());
        return itemView;
    }
}
