package com.heima.netframe.mvp.model;

import com.heima.netframe.net.response.LoginResponse;
import com.heima.netframe.mvp.contract.LoginContract;

import io.reactivex.Observable;


public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<LoginResponse> getLogin(String username, String password) {
        return mApiService.login(username, password);
    }
}
