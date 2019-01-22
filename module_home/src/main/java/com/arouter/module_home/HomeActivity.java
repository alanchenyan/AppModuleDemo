package com.arouter.module_home;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.arouter.baselibrary.BaseActivity;

/**
 * 独编译运行时调用
 */
public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
