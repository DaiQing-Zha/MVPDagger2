package com.example.daiqingzha.mvpdagger2.example.dagger;

import javax.inject.Inject;

/**
 * Created by DaiQing.Zha on 2017/8/12.
 * email:13767191284@163.com
 * description:
 */

public class DownloadPresenter implements DownloadContract.Presenter {

    private final DownloadContract.View mDownloadView;
    @Inject
    public DownloadPresenter(DownloadContract.View view) {
        mDownloadView = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void download(String address) {
    }
}
