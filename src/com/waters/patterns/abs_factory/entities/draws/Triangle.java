package com.waters.patterns.abs_factory.entities.draws;

import com.waters.patterns.abs_factory.interfaces.Draw;

public class Triangle implements Draw {
    @Override
    public void draw() {
        System.out.println("画了个三角形");
    }
}
