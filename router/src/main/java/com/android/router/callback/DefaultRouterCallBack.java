package com.android.router.callback;

import com.android.router.util.LogUtil;

/**
 * Created by liuzhao on 2017/9/17.
 */

public class DefaultRouterCallBack implements RouterCallBack {
    @Override
    public void onFound() {
        LogUtil.i("onFound");
    }

    @Override
    public void onLost() {
        LogUtil.e("onLost");
    }

    @Override
    public void onOpenSuccess() {
        LogUtil.i("onOpenSuccess");
    }

    @Override
    public void onOpenFailed() {
        LogUtil.e("onOpenFailed");
    }
}
