package com.waters.patterns.abs_factory.entities.colors;

import com.waters.patterns.abs_factory.interfaces.Color;

public class Yellow implements Color {
    @Override
    public void paint() {
        System.out.println("画了黄色");
    }
}
