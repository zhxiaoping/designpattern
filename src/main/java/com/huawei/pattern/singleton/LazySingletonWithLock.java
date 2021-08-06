package com.huawei.pattern.singleton;

public class LazySingletonWithLock {

    private static LazySingletonWithLock instance;
    private LazySingletonWithLock (){}

    public static LazySingletonWithLock getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithLock();
        }
        return instance;
    }
}
