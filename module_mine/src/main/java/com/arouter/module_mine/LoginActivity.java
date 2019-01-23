package com.arouter.module_mine;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.aroute.module_route.MineRoutePath;
import com.arouter.baselibrary.BaseActivity;

/**
 * 独编译运行时调用
 */
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mine);

        final Button btnLogin = findViewById(R.id.btn_login);
        final EditText et_login = findViewById(R.id.et_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(MineRoutePath.LOGIN_RESULT_ACTIVITY)
                        .withString("name", et_login.getText().toString())
                        .withInt("age", 28)
                        .navigation(LoginActivity.this,  new NavigationCallback() {
                            @Override
                            public void onFound(Postcard postcard) {
                                Log.e("TAG", "onFound:找到了");
                            }

                            @Override
                            public void onLost(Postcard postcard) {
                                Log.e("TAG", "onLost:没找到");
                            }

                            @Override
                            public void onArrival(Postcard postcard) {
                                Log.e("TAG", "onArrival：完成了");
                            }

                            @Override
                            public void onInterrupt(Postcard postcard) {
                                Log.e("TAG", "onInterrupt：被拦截了");
                            }
                        });
            }
        });
    }
}
