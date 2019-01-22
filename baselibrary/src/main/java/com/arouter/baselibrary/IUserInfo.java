package com.arouter.baselibrary;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * date：2018/7/9 on 14:40
 * description: 服务管理： 用于模块之间进行数据的传递，例如：首页模块没依赖我的模块，但是需要获取我的模块的数据，就是用这个
 */

public interface IUserInfo extends IProvider {
    String getName();
}
