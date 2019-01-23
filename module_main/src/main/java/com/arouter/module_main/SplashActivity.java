package com.arouter.module_main;

import android.animation.Animator;
import android.os.Bundle;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.aroute.module_route.MainRoutePath;
import com.arouter.baselibrary.base.BaseActivity;


/**
 * 闪屏页面
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final ImageView ivImage = findViewById(R.id.iv_image);
        ivImage.post(new Runnable() {
            @Override
            public void run() {
                Animator circularReveal = ViewAnimationUtils.createCircularReveal(ivImage, ivImage.getWidth() / 2,
                        ivImage.getHeight() / 2, 0, ivImage.getWidth());
                circularReveal.setDuration(2000);
                circularReveal.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        //greenChannel表示跳过拦截器验证
                        ARouter.getInstance().build(MainRoutePath.LOGIN_ACTIVITY).greenChannel().navigation();
                        finish();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                circularReveal.start();
            }
        });
    }
}
