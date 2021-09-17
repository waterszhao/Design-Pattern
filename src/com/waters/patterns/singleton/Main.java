package com.waters.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton==singleton1);//true;

        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton2 = constructor.newInstance();
        System.out.println(singleton==singleton2);//false,该单例模式不能防止反射攻击
    }
}
