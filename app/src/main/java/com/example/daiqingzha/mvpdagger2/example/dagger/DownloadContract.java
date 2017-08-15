package com.example.daiqingzha.mvpdagger2.example.dagger;

import com.example.daiqingzha.mvpdagger2.example.dagger.base.BasePresenter;
import com.example.daiqingzha.mvpdagger2.example.dagger.base.BaseView;

/**
 * Created by DaiQing.Zha on 2017/8/12.
 * email:13767191284@163.com
 * description:
 */

public interface DownloadContract {

    interface View extends BaseView<Presenter>{
        void showDownloadSuccess();
    }
    interface Presenter extends BasePresenter{
        void download(String address);
    }
}
