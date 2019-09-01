package com.heima.netframe.mvp.presenter;

import android.util.Log;

import com.heima.netframe.base.BasePresenter;
import com.heima.netframe.net.BaseObserver;
import com.heima.netframe.net.response.LoginResponse;
import com.heima.netframe.mvp.contract.LoginContract;
import com.heima.netframe.mvp.model.LoginModel;
import com.heima.netframe.net.RxTransformer;

public class LoginPresenter extends BasePresenter<LoginContract.View> {
    LoginModel loginModel;
    /**
     * 构造函数绑定V
     *
     * @param view V
     */
    public LoginPresenter(LoginContract.View view) {
        super(view);
        loginModel=new LoginModel();
    }

    public void login(String username, String password){
        loginModel.getLogin(username, password)
                .compose(RxTransformer.obsTransform())
                .subscribe(new BaseObserver<LoginResponse>() {
                    @Override
                    public void onSuccess(LoginResponse response) {
                        Log.e("AAAAA", response.toString());
                    }

                    @Override
                    public void onFailure(String msg) {

                    }
                });
    }
}
