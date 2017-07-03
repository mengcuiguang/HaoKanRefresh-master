package com.meng.refreshdemo.library.listener;

import com.meng.refreshdemo.library.core.RefreshLayout;

/**
 * Created by cjj on 2015/8/5.
 * wave回调监听
 */
public interface PullWaveListener {
    /**
     * 下拉中
     * @param refreshLayout
     * @param fraction
     */
    void onPulling(RefreshLayout refreshLayout, float fraction);

    /**
     * 下拉松开
     * @param refreshLayout
     * @param fraction
     */
    void onPullReleasing(RefreshLayout refreshLayout, float fraction);
}
