package com.asifk.retrofitjson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {
    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST("addbundle")
    Call<String> getPosts(@Body BundleAPI fooRequest);

}
