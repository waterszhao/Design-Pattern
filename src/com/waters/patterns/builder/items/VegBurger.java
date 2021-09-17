package com.waters.patterns.builder.items;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 15;
    }
}
