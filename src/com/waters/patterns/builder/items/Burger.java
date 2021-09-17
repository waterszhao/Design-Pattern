package com.waters.patterns.builder.items;

import com.waters.patterns.builder.packing.Packing;
import com.waters.patterns.builder.packing.Wrapper;

public abstract class Burger implements Item{

    @Override
    public Packing packaging() {
        return new Wrapper();
    }

    public abstract double price();
}
