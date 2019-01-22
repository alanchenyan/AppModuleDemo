package com.arouter.module_video;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.arouter.baselibrary.BaseFragment;
import com.arouter.baselibrary.RouteURL;

/**
 * 模块编译运行时调用
 */
@Route(path = RouteURL.VIDEO_FRAGMENT)
public class VideoFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
