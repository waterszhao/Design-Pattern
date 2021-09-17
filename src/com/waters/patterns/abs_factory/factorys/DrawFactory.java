package com.waters.patterns.abs_factory.factorys;

import com.waters.patterns.abs_factory.entities.draws.Circle;
import com.waters.patterns.abs_factory.entities.draws.Rectangle;
import com.waters.patterns.abs_factory.entities.draws.Triangle;
import com.waters.patterns.abs_factory.interfaces.Color;
import com.waters.patterns.abs_factory.interfaces.Draw;
import com.waters.patterns.abs_factory.interfaces.Factory;

public class DrawFactory implements Factory {

    @Override
    public Draw getDraw(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Triangle":
                return new Triangle();
        }
        System.out.println("无符合图形");
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
