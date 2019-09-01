package com.heima.netframe.mvp.contract;

import com.heima.netframe.base.BaseModel;
import com.heima.netframe.base.BaseView;
import com.heima.netframe.net.response.LoginResponse;


import io.reactivex.Observable;

public interface LoginContract {
    interface Model extends BaseModel {
        Observable<LoginResponse> getLogin(String username, String password);
    }

    interface View extends BaseView {
    }

    interface Presenter {
    }
}
