package com.example.daiqingzha.mvpdagger2.example.inject;

import android.util.Log;

/**
 * Created by DaiQing.Zha on 2017/8/11.
 * email:13767191284@163.com
 * description:目标类/宿主类
 */

public class TargetClass implements IInterface{

    private IDepend dependClass;

    @Override
    public void setDepend(IDepend depend) {
        this.dependClass = depend;
    }

    /**
     * 宿主类的操作
     */
    public void operation(){
        //首先调用依赖类来打印日志
        dependClass.printLog();
        Log.e("TargetClass_operation","开始分析日志···");
    }
}
