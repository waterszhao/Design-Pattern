package com.waters.patterns.factory.entities;

import com.waters.patterns.factory.interfaces.Draw;

public class Circle implements Draw {
    @Override
    public void draw() {
        System.out.println("画了个圆");
    }
}
