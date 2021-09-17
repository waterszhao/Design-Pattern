package com.waters.patterns.builder.items;

public class Milk extends Drink{
    @Override
    public String name() {
        return "Milk";
    }

    @Override
    public double price() {
        return 10;
    }
}
