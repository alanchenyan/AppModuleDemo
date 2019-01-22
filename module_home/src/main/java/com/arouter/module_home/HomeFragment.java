package com.arouter.module_home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.arouter.baselibrary.BaseFragment;
import com.arouter.baselibrary.IUserInfo;
import com.arouter.baselibrary.JumpUtil;

/**
 * 模块编译运行时调用
 */
@Route(path = JumpUtil.Fragment_Home)
public class HomeFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        View view = inflater.inflate(R.layout.activity_home, null);
        TextView tv_text = view.findViewById(R.id.tv_text);
        String name = ARouter.getInstance().navigation(IUserInfo.class).getName();
        tv_text.setText("欢迎 " +name +"～～");
        return view;
    }
}
