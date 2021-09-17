package com.waters.patterns.abs_factory;

import com.waters.patterns.abs_factory.factorys.ColorFactory;
import com.waters.patterns.abs_factory.factorys.DrawFactory;
import com.waters.patterns.abs_factory.interfaces.Factory;

public class AbsFactory {
    public Factory getFactory(String factory){
        switch (factory){
            case "Draw":
                return new DrawFactory();
            case "Color":
                return new ColorFactory();
        }
        throw new NullPointerException("please choose 'Draw' or 'Color', not '"+factory+"'.");
    }
}
