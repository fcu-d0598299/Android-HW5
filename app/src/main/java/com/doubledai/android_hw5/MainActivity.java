package com.doubledai.android_hw5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> score = new ArrayList<AlbumItem>(); //資料

        score.add(new AlbumItem("騎士 ","   106",R.drawable.a106));
        score.add(new AlbumItem("溜馬    102","",R.drawable.b102));
        score.add(new AlbumItem("火箭 ","   113",R.drawable.c113));
        score.add(new AlbumItem("雷霆    109","",R.drawable.d109));

        AlbumArrayAdapter adapter =
                new AlbumArrayAdapter(this, score);

        lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);


    }
}
