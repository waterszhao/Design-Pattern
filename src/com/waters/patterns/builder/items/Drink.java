package com.waters.patterns.builder.items;

import com.waters.patterns.builder.packing.Bottle;
import com.waters.patterns.builder.packing.Packing;

public abstract class Drink implements Item{

    @Override
    public Packing packaging() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
