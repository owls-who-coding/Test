package com.example.testrestapi;

import com.google.gson.JsonObject;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.internal.Version;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface NetworkService {
    @GET("/aitest/get/")
    Call<JsonObject> get_value();





//    @POST("/api/restaurants/")
//    Call<Restaurant> post_restaruant(@Body Restaurant restaruant){
//        return null;
//    }
//
//    @PATCH("/api/restaurants/{pk}/")
//    Call<Restaurant> patch_restaruant(@Path("pk") int pk, @Body Restaurant restaruant){
//        return null;
//    }
//
//    @DELETE("/api/restaurants/{pk}/")
//    Call<Restaurant> delete_restaruant(@Path("pk") int pk){
//        return null;
//    }
//
//    @GET("/api/restaurants/")
//    Call<List<Restaurant>> get_restaruant(){
//        return null;
//    }
//
//    @GET("/api/restaurants/{pk}/")
//    Call<Restaurant> get_pk_restaruant(@Path("pk") int pk){
//        return null;
//    }
//
//    @GET("/api/weathers/{pk}/restaurant_list/")
//    Call<List<Restaurant>> get_weather_pk_restaruant(@Path("pk") int pk){
//        return null;
//    }
}
