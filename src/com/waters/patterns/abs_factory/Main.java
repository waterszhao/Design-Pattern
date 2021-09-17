package com.waters.patterns.abs_factory;

import com.waters.patterns.abs_factory.interfaces.Color;
import com.waters.patterns.abs_factory.interfaces.Factory;

public class Main {
    public static void main(String[] args) {
        AbsFactory absFactory = new AbsFactory();
        Factory factory = absFactory.getFactory("Color");
        Color color = factory.getColor("Green");
        color.paint();
    }
}
