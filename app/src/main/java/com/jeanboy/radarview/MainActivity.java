package com.jeanboy.radarview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jeanboy.radarview.view.RadarData;
import com.jeanboy.radarview.view.RadarView;
import com.jeanboy.radarview.view.CustomImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadarView radarView = (RadarView) findViewById(R.id.radarView);

        List<RadarData> dataList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            RadarData data = new RadarData("标题" + i, i * 11);
            dataList.add(data);
        }
        radarView.setDataList(dataList);

        // 初始化自定义ImageView并设置坐标点
        CustomImageView customImageView = (CustomImageView) findViewById(R.id.customImageView);
        customImageView.setPoints(new float[]{0, 4.5f, 3.5f, 0, 0, -2.5f, -3.5f, 0});
    }

    public void do3Test(View v){
        RadarView radarView = (RadarView) findViewById(R.id.radarView);

        List<RadarData> dataList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            RadarData data = new RadarData("标题" + i, i * 11);
            dataList.add(data);
        }
        radarView.setDataList(dataList);
    }

    public void do4Test(View v){
        RadarView radarView = (RadarView) findViewById(R.id.radarView);

        List<RadarData> dataList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            RadarData data = new RadarData("标题" + i, i * 11);
            dataList.add(data);
        }
        radarView.setDataList(dataList);
    }

    public void do6Test(View v){
        RadarView radarView = (RadarView) findViewById(R.id.radarView);

        List<RadarData> dataList = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            RadarData data = new RadarData("标题" + i, i * 11);
            dataList.add(data);
        }
        radarView.setDataList(dataList);
    }

    public void do9Test(View v){
        RadarView radarView = (RadarView) findViewById(R.id.radarView);

        List<RadarData> dataList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            RadarData data = new RadarData("标题" + i, i * 11);
            dataList.add(data);
        }
        radarView.setDataList(dataList);
    }

}
