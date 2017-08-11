package com.example.daiqingzha.mvpdagger2.example.inject;

/**
 * Created by DaiQing.Zha on 2017/8/11.
 * email:13767191284@163.com
 * description:
 */

public class FactoryDepend {
    public static IDepend getDepend(String classz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> c = Class.forName(classz);
        Object object = c.newInstance();
        return (IDepend) object;
    }
}
