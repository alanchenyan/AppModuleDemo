package com.arouter.module_mine;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.aroute.module_route.MineRoutePath;
import com.arouter.baselibrary.BaseFragment;

/**
 * 模块编译运行时调用
 */
@Route(path = MineRoutePath.MINE_FRAGMENT)
public class MineFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, null);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button btnLogin = view.findViewById(R.id.btn_login);
        final EditText et_login = view.findViewById(R.id.et_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(MineRoutePath.LOGIN_RESULT_ACTIVITY)
                        .withString("name", et_login.getText().toString())
                        .withInt("age", 28)
                        .navigation(getActivity(),  new NavigationCallback() {
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
