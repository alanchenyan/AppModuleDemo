package com.arouter.baselibrary;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * date：2018/7/3 on 10:59
 * description:
 *
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRouter(this);
    }

    private void initRouter(MyApplication myApplication) {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(myApplication);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
