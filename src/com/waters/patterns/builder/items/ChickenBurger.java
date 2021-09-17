package com.waters.patterns.builder.items;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 20;
    }
}
