package com.example.wanglei.baselibrary_wl.base;

import android.content.Context;

import com.example.wanglei.baselibrary_wl.utils.NetUtils.RequestListener;


/**
 * Created by Mark.Han on 2017/7/13.
 */

public interface BasePresenter<T extends BaseView> extends RequestListener {

    void attach(T view);

    void detach();

    void showDialog(int what);

    void cancelDialog(int what);

    T getView();

    Context getContext();
}
