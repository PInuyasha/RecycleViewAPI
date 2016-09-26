package com.example.recycleview.recycleviewapi.rest;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by STR01587 on 20/9/2559.
 */

public class MyClient {

    public static final String BASE_URL = "http://10.215.136.45/";
    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(new OkHttpClient())
                    .build();
        }
        return retrofit;
    }

}