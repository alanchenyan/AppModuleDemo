package com.arouter.module_mine;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.aroute.module_route.MineRoutePath;
import com.arouter.baselibrary.IUserInfo;

/**
 * date：2018/7/9 on 14:41
 * description:
 */
@Route(path = MineRoutePath.USER_SERVICE)
public class UserInfoImpl implements IUserInfo {
    @Override
    public String getName() {
        return "Alan Chen";
    }

    @Override
    public void init(Context context) {

    }
}
