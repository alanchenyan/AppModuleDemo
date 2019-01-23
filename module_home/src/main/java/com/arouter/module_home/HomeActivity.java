package com.arouter.module_home;

import android.os.Bundle;

import com.arouter.baselibrary.base.BaseActivity;


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
