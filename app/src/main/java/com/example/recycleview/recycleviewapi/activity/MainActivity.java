package com.example.recycleview.recycleviewapi.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.recycleview.recycleviewapi.adapter.MyAdapter;
import com.example.recycleview.recycleviewapi.R;
import com.example.recycleview.recycleviewapi.model.ContinentRequest;
import com.example.recycleview.recycleviewapi.model.ContinentResponse;
import com.example.recycleview.recycleviewapi.model.Country;
import com.example.recycleview.recycleviewapi.rest.MyClient;
import com.example.recycleview.recycleviewapi.rest.MyInterfaceApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

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

        MyInterfaceApi api = MyClient.getRetrofit().create(MyInterfaceApi.class);

        ContinentRequest request = new ContinentRequest();
        request.setContinent("asean");
        Call<ContinentResponse> call = api.getContinent(request);
        call.enqueue(new Callback<ContinentResponse>() {
            @Override
            public void onResponse(Call<ContinentResponse> call, Response<ContinentResponse> response) {
                List<Country> country = response.body().getCountrirs();

                mAdapter = new MyAdapter(country, getApplicationContext());
                mRecyclerView.setAdapter(mAdapter);

                Log.d(TAG,"country" + country.toString());
            }

            @Override
            public void onFailure(Call<ContinentResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });

        Button mClose = (Button)findViewById(R.id.buttonOK);
        mClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}