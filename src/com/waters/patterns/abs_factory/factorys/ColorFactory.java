package com.waters.patterns.abs_factory.factorys;

import com.waters.patterns.abs_factory.entities.colors.Green;
import com.waters.patterns.abs_factory.entities.colors.Red;
import com.waters.patterns.abs_factory.entities.colors.Yellow;
import com.waters.patterns.abs_factory.interfaces.Color;
import com.waters.patterns.abs_factory.interfaces.Draw;
import com.waters.patterns.abs_factory.interfaces.Factory;

public class ColorFactory implements Factory {

    @Override
    public Draw getDraw(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "Green":
                return new Green();
            case "Red":
                return new Red();
            case "Yellow":
                return new Yellow();
        }
        System.out.println("无符合颜色");
        return null;
    }
}
