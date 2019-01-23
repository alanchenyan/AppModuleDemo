package com.arouter.module_main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.aroute.module_route.MainRoutePath;
import com.arouter.baselibrary.MyApplication;
import com.arouter.baselibrary.base.BaseActivity;

/**
 * 登录界面
 */
@Route(path = MainRoutePath.LOGIN_ACTIVITY)
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button btnLogin = findViewById(R.id.btn_login);
        final EditText et_login = findViewById(R.id.et_login);

        final String name = et_login.getText().toString();

        /**
         * 正常登录进入
         */
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (verifyLogin(name)) {
                    ARouter.getInstance().build(MainRoutePath.MAIN_ACTIVITY)
                            .withString("name", name)
                            .withInt("age", 28)
                            .navigation();
                }
            }
        });


        /**
         * 尝试不登录进入  会被拦截器拦截
         */
        final Button btnForward = findViewById(R.id.btn_forward);

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(MainRoutePath.MAIN_ACTIVITY).navigation();
            }
        });


        /**
         * 跳转目标页面不存在，触发降级策略 避免crash
         */
        final Button btnDegrade = findViewById(R.id.btn_degrade);

        btnDegrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/test/test").navigation();
            }
        });
    }


    /**
     * 登录账号校验  正常应该访问服务器校验
     *
     * @param name
     * @return
     */
    private boolean verifyLogin(String name) {
        MyApplication.getInstance().setAuthToken("@A4sn2243434er");
        return true;
    }
}
