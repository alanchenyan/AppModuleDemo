package com.arouter.module_video;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.arouter.baselibrary.BaseFragment;
import com.arouter.baselibrary.IUserInfo;
import com.arouter.baselibrary.RouteURL;

/**
 * 模块编译运行时调用
 */
@Route(path = RouteURL.VIDEO_FRAGMENT)
public class VideoFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_video, null);
        return view;
    }
}


