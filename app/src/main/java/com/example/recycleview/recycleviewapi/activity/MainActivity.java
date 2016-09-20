package com.example.recycleview.recycleviewapi.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recycleview.recycleviewapi.adapter.MyAdapter;
import com.example.recycleview.recycleviewapi.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new MyAdapter(generateData());
        mRecyclerView.setAdapter(mAdapter);
    }

    private String[] generateData(){
        String[] myDataset = new String[26];
        myDataset[0] = "qqq";
        myDataset[1] = "www";
        myDataset[2] = "eee";
        myDataset[3] = "rrr";
        myDataset[4] = "ttt";
        myDataset[5] = "yyy";
        myDataset[6] = "uuu";
        myDataset[7] = "iii";
        myDataset[8] = "ooo";
        myDataset[9] = "ppp";
        myDataset[10] = "aaa";
        myDataset[11] = "sss";
        myDataset[12] = "ddd";
        myDataset[13] = "fff";
        myDataset[14] = "ggg";
        myDataset[15] = "hhh";
        myDataset[16] = "jjj";
        myDataset[17] = "kkk";
        myDataset[18] = "lll";
        myDataset[19] = "zzz";
        myDataset[20] = "xxx";
        myDataset[21] = "ccc";
        myDataset[22] = "vvv";
        myDataset[23] = "bbb";
        myDataset[24] = "nnn";
        myDataset[25] = "mmm";
        return myDataset;
    }
}
