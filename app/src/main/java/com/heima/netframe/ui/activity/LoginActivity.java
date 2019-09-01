package com.heima.netframe.ui.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heima.netframe.R;
import com.heima.netframe.base.BaseMvpActivity;
import com.heima.netframe.mvp.contract.LoginContract;
import com.heima.netframe.mvp.model.LoginModel;
import com.heima.netframe.mvp.presenter.LoginPresenter;

public class LoginActivity extends BaseMvpActivity<LoginPresenter> implements LoginContract.View {


    @Override
    protected int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState) {
        mPresenter=new LoginPresenter(this);
        mPresenter.login("aaa","bbb");
    }
}
