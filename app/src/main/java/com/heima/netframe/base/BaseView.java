package com.heima.netframe.base;

import com.trello.rxlifecycle2.LifecycleTransformer;

public interface BaseView {
    /**
     * Lifecycle管理生命周期 RxFragment/RxActivity自动实现bindToLifecycle
     * @param <T>
     * @return
     */
    <T> LifecycleTransformer<T> bindToLifecycle();
}
