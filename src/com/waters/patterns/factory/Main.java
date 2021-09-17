package com.waters.patterns.factory;

import com.waters.patterns.factory.interfaces.Draw;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Draw draw = factory.getDraw("Rectangle");
        draw.draw();
        draw = factory.getDraw("Triangle");
        draw.draw();
        //draw = factory.getDraw("三角形");
        //draw.draw();//空指针异常
    }
}
