package com.arouter.module_mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.aroute.module_route.MineRoutePath;
import com.arouter.baselibrary.base.BaseFragment;

/**
 * 主页tab mine
 */
@Route(path = MineRoutePath.MINE_FRAGMENT)
public class MineFragment extends BaseFragment {

    private String name;
    private int age;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mine, null);
        TextView tv_username = view.findViewById(R.id.tv_username);

        name = getArguments().getString("name");
        age = getArguments().getInt("age");
        tv_username.setText("用户："+name +"  年龄："+age);
        return view;
    }
}
