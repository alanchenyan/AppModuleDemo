package com.arouter.module_mine;

import android.os.Bundle;

import com.arouter.baselibrary.BaseActivity;

/**
 * 独编译运行时调用
 */
public class TwoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mine);
    }
}
