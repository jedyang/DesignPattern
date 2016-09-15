package com.yunsheng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shengyun on 16/9/15.
 */
public class DynamicProxy implements InvocationHandler {

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    private Subject subject;



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");

        Object result = method.invoke(subject,args);

        System.out.println("after invoke");
        return result;
    }
}
