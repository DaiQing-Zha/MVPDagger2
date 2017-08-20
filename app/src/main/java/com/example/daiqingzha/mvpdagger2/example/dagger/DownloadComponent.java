package com.example.daiqingzha.mvpdagger2.example.dagger;

import dagger.Component;

/**
 * Created by DaiQing.Zha on 2017/8/14.
 * email:13767191284@163.com
 * description:
 */
@Component(modules = DownloadModule.class)
public interface DownloadComponent {
    void inject(DownloadActivity activity);
}
