package com.waters.patterns.factory;

import com.waters.patterns.factory.entities.Circle;
import com.waters.patterns.factory.entities.Rectangle;
import com.waters.patterns.factory.entities.Triangle;
import com.waters.patterns.factory.interfaces.Draw;

public class Factory {
    public Draw getDraw(String shape){
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
}
