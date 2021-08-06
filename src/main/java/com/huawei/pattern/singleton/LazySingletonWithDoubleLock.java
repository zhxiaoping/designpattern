package com.huawei.pattern.singleton;

public class LazySingletonWithDoubleLock {

    private volatile static LazySingletonWithDoubleLock singleton;
    private LazySingletonWithDoubleLock (){}

    public static LazySingletonWithDoubleLock getSingleton() {
        if (singleton == null) {
            synchronized (LazySingletonWithDoubleLock.class) {
                if (singleton == null) {
                    singleton = new LazySingletonWithDoubleLock();
                }
            }
        }
        return singleton;
    }
}
