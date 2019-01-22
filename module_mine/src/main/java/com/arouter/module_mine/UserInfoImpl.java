package com.arouter.module_mine;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.arouter.baselibrary.IUserInfo;
import com.arouter.baselibrary.RouteURL;

/**
 * date：2018/7/9 on 14:41
 * description:
 */
@Route(path = RouteURL.USER_SERVICE)
public class UserInfoImpl implements IUserInfo {
    @Override
    public String getName() {
        return "张三";
    }

    @Override
    public void init(Context context) {

    }
}
