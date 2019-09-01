package com.heima.netframe;

import android.app.Application;

/**
 * Incremental change is better than ambitious failure.
 *
 * @author : <a href="http://mysticcoder.coding.me">MysticCoder</a>
 * @date : 2018/3/15
 * @desc :
 */

public class XxApplication extends Application {

    private static XxApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        //ApiEngine.getInstance().init();
    }

    public static XxApplication getContext() {
        return mContext;
    }
}
