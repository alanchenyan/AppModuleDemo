package com.arouter.baselibrary;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

/**
 * date：2018/7/9 on 14:01
 * description: 拦截器:用于跳转时候的拦截。可以定义多个拦截器,只需要加上注解就可以，不用在其他进行进行调用，但是比较奇葩的是，每次所有的跳转
 * 都会执行拦截器操作，arouter提供了greenChannel()方法进行跳转过去一切拦截器，在不需要拦截器的地方跳转的时候加上即可。
 */
@Interceptor(priority = 4)
public class TestInterceptor implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        //进行逻辑判断
        if (true) {
            callback.onContinue(postcard);
            Log.e("TestInterceptor","数据正常不进行拦截");
        } else {
           //  callback.onInterrupt(null);
            callback.onInterrupt(new RuntimeException("得有点异常"));
            Log.e("TestInterceptor","数据异常进行拦截");
        }

    }

    @Override
    public void init(Context context) {

    }
}
