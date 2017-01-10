package com.example.recycleview.recycleviewapi.rest;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by STR01587 on 20/9/2559.
 */

public class ContinentService {

    public static final String BASE_URL = "http://172.20.120.121/";
    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){
        if (retrofit==null){

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120, TimeUnit.SECONDS)
                    .addInterceptor(createHttpLoggingInterceptor())
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

    private static HttpLoggingInterceptor createHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }
}