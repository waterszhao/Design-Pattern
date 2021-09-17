package com.waters.patterns.builder.items;

public class Cola extends Drink{
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public double price() {
        return 5;
    }
}
