package com.example.daiqingzha.mvpdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daiqingzha.mvpdagger2.example.inject.FactoryDepend;
import com.example.daiqingzha.mvpdagger2.example.inject.TargetClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TargetClass targetClass = new TargetClass();
        try {
            targetClass.setDepend( FactoryDepend.getDepend("com.example.daiqingzha.mvpdagger2.example.inject.DependClass"));
        } catch (ClassNotFoundException e) {

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        targetClass.operation();
    }
}
