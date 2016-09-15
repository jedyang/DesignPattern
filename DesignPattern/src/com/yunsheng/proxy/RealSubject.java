package com.yunsheng.proxy;

/**
 * Created by shengyun on 16/9/15.
 */
public class RealSubject implements Subject {


    @Override
    public void hello(String str) {
        System.out.println("hello " + str);
    }
}
