package com.arouter.baselibrary;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 *
 * 要用ARouter跳转才能拦截到，用Intent隐式或显示跳转无法拦截，出错还是会crash
 */
@Route(path = RoutePath.DEGRADE)
public class DegradeServiceImpl implements DegradeService {
    @Override
    public void onLost(Context context, Postcard postcard) {
        ARouter.getInstance().build(RoutePath.DEGRADE_TIP).greenChannel().navigation();
    }

    @Override
    public void init(Context context) {

    }
}
