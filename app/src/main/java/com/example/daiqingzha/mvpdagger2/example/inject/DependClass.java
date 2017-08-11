package com.example.daiqingzha.mvpdagger2.example.inject;

import android.util.Log;

/**
 * Created by DaiQing.Zha on 2017/8/11.
 * email:13767191284@163.com
 * description:依赖类
 */

public class DependClass implements IDepend{
    /**
     * 打印日志
     */
    @Override
    public void printLog(){
        Log.e("DependClass_printLog","我是你们依赖的类，你们需要我来打印日志----------------------");
    }
}
