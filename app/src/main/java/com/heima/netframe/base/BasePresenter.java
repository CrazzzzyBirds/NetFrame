package com.heima.netframe.base;

import android.annotation.SuppressLint;

import androidx.core.util.Preconditions;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

import io.reactivex.disposables.CompositeDisposable;

@SuppressLint("RestrictedApi")
public class BasePresenter<V extends BaseView> {
    /**
     * 虚引用+泛型解决MVP中的内存泄漏问题
     * P层持有V层的强引用，某些操作结束之前V被销毁了，V对象将无法被回收，产生内存泄露。
     */
    protected Reference<V> mView;

    protected CompositeDisposable mCompositeDisposable;

    protected V getView() {
        return mView.get();
    }

    /**
     * 构造函数绑定V
     *
     * @param view V
     */
    public BasePresenter(V view) {
        Preconditions.checkNotNull(view, BaseView.class.getName() + "%s cannot be null");
        attachView(view);
    }

    public void attachView(V view) {
        this.mView = new WeakReference<>(view);
    }

    public void detachView() {
        if (mView != null) {
            mView.clear();
            mView = null;
        }
    }
}
