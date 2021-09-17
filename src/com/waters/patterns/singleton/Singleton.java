package com.waters.patterns.singleton;

//饿汉模式
//public class Singleton {
//    private static Singleton instance = new Singleton();
//
//    private static int data = 10;
//
//    private Singleton(){};
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

//懒汉模式
public class Singleton {
    private volatile static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

}