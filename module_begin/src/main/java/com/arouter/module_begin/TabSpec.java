package com.arouter.module_begin;

import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * 首页tab信息
 */
public class TabSpec {

    public int icon;
    public String name;
    public FragmentTabHost tabHost;
    public View view;
    public ImageView imageView;
    public TextView textView;

    public TabSpec(FragmentTabHost tabHost, String name, int icon) {
        this.tabHost = tabHost;
        this.icon = icon;
        this.name = name;
        initTabView();
    }

    public TabHost.TabSpec getTabSpec() {
        imageView.setImageResource(icon);
        textView.setText(name);
        return tabHost.newTabSpec(name).setIndicator(view);
    }

    private void initTabView() {
        view = View.inflate(tabHost.getContext(), R.layout.tabcontent, null);
        imageView = view.findViewById(R.id.image);
        textView = view.findViewById(R.id.text);
    }
}
