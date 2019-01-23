package com.arouter.baselibrary.interceptor;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.arouter.baselibrary.MyApplication;
import com.arouter.baselibrary.RoutePath;

/**
 *
 * 权限校验拦截器
 */
@Interceptor(priority = 1)
public class AuthInterceptor implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        /**
         * 是否有登录判断
         */
        if (MyApplication.getInstance().getAuthToken()!=null) {
            callback.onContinue(postcard);
        } else {
            callback.onInterrupt(new RuntimeException("未登录的非法访问"));
            ARouter.getInstance().build(RoutePath.AUTH_TIP_ACTIVITY).greenChannel().navigation();
        }
    }

    @Override
    public void init(Context context) {

    }
}
