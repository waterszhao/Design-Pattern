package com.waters.patterns.abs_factory.interfaces;

import com.waters.patterns.abs_factory.interfaces.Color;
import com.waters.patterns.abs_factory.interfaces.Draw;

public interface Factory {
    Draw getDraw(String shape);
    Color getColor(String color);
}
