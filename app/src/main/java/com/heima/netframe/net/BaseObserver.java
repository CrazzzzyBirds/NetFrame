package com.heima.netframe.net;
import android.text.TextUtils;
import android.util.Log;

import com.heima.netframe.net.exception.ApiException;
import com.heima.netframe.net.exception.ResultException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**
 * 封装Observer处理异常
 * @param <T>
 */
public abstract class BaseObserver<T> implements Observer<T> {

        @Override
        public void onSubscribe(Disposable d) {

        }

        @Override
        public void onNext(T response) {
            onSuccess(response);
        }

        @Override
        public void onError(Throwable e) {
            if (e instanceof ResultException){
                onFailure(e.getMessage());
            }else {
                String error = ApiException.handleException(e).getMessage();
                doError(error);
            }
        }

        @Override
        public void onComplete() {
        }

        /**
         * 请求成功
         *
         * @param response 服务器返回的数据
         */
        public abstract void onSuccess(T response);

        /**
         * 服务器返回数据，但code不在约定成功范围内
         *
         * @param msg 服务器返回的数据
         */
        public abstract void onFailure(String msg);



    private void doError(String err ){
            Log.e("APIException",err);
    }






}
