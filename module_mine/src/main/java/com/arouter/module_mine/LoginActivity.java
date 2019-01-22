package com.arouter.module_mine;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.arouter.baselibrary.BaseActivity;
import com.arouter.baselibrary.RouteURL;


@Route(path = RouteURL.LOGIN_ACTIVITY)
public class LoginActivity extends BaseActivity {
    @Autowired(name = "name")
    public String name;
    @Autowired(name = "age")
    public int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_button);
        TextView tv_username = findViewById(R.id.tv_username);
        tv_username.setText("用户名称："+name);
        Log.e("TAG", name);
        Log.e("TAG", age + "");
    }
}
