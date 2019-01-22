package com.arouter.baselibrary;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.service.DegradeService;

/**
 * date：2018/7/9 on 14:36
 * description:降级策略，隐性的Intent不能匹配所有的Activity时，我们的Activity就会报错，更坏的结果就是会导致崩溃,降级策略就是为了解决这个问题的。
 */
//@Route(path = JumpUtil.ClickButtonActivity)
public class DegradeServiceImpl implements DegradeService {
    @Override
    public void onLost(Context context, Postcard postcard) {

    }

    @Override
    public void init(Context context) {

    }
}
