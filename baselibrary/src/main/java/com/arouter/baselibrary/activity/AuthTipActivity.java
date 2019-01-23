package com.arouter.baselibrary.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.arouter.baselibrary.R;
import com.arouter.baselibrary.RoutePath;
import com.arouter.baselibrary.base.BaseActivity;

/**
 * 无权限访问提示页面
 */
@Route(path = RoutePath.AUTH_TIP_ACTIVITY)
public class AuthTipActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_tip);

        final Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
