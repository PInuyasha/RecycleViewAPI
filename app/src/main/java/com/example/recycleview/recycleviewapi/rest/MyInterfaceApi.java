package com.example.recycleview.recycleviewapi.rest;

import com.example.recycleview.recycleviewapi.model.ContinentRequest;
import com.example.recycleview.recycleviewapi.model.ContinentResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by STR01587 on 21/9/2559.
 */

public interface MyInterfaceApi {

    @POST("getContinent")
    Call<ContinentResponse> getContinent(@Body ContinentRequest request);

}