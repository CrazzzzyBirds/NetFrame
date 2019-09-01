package com.heima.netframe.net;

import com.heima.netframe.net.response.LoginResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface ApiService {
    String BASE_URL = "https://www.wanandroid.com/";


    @FormUrlEncoded
    @POST("user/login")
    Observable<LoginResponse> login(@Field("username") String username, @Field("password") String password);
}
