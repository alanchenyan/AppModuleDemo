package com.arouter.module_video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.aroute.module_route.VideoRoutePath;
import com.arouter.baselibrary.base.BaseFragment;

/**
 * 主页 video
 */
@Route(path = VideoRoutePath.VIDEO_FRAGMENT)
public class VideoFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_video, null);
        return view;
    }
}


