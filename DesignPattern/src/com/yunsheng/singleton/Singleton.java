package com.yunsheng.singleton;

enum Singleton4 {
    INSTANCE;
}

/**
 * Created by shengyun on 16/9/15.
 */

// 最简单：懒汉式单例
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

}

// 使用静态内部类
class Singleton2 {

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static final Singleton2 instance = new Singleton2();
    }
}

// DCl
class Singleton3 {

    // 注意volatile的使用
    private volatile static Singleton3 singleton = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (null == singleton) {
            synchronized (Singleton3.class) {
                if (null == singleton) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

}