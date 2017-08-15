package com.example.daiqingzha.mvpdagger2.example.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daiqingzha.mvpdagger2.R;

import javax.inject.Inject;

/**
 * Created by DaiQing.Zha on 2017/8/12.
 * email:13767191284@163.com
 * description:
 */
public class DownloadActivity extends AppCompatActivity implements DownloadContract.View{

    @Inject DownloadPresenter mDownPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
    }

    @Override
    public void setPresenter(DownloadContract.Presenter presenter) {

    }

    @Override
    public void showDownloadSuccess() {

    }
}
