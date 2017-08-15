package com.example.daiqingzha.mvpdagger2.example.dagger;

import dagger.Provides;

/**
 * Created by DaiQing.Zha on 2017/8/14.
 * email:13767191284@163.com
 * description:
 */

public class DownloadModule {

    private final DownloadContract.View mView;
    private String mTaskId;

    public DownloadModule(DownloadContract.View mView, String mTaskId) {
        this.mView = mView;
        this.mTaskId = mTaskId;
    }

    @Provides
    DownloadContract.View provideDownloadContractView(){
        return mView;
    }
    @Provides
    String provideTaskId(){
        return mTaskId;
    }

}
