package com.waters.patterns.builder;

import com.waters.patterns.builder.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items;
    String name;

    public Meal(String name){
        items = new ArrayList<>();
        this.name = name;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float sum = 0f;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void getMeal(){
        System.out.println("\nmeal: " + name + "\n");
        System.out.println("---------");
        for (Item item : items) {
            System.out.println("item: " + item.name());
            System.out.println("price: " + item.price());
            System.out.println("packing: " + item.packaging().pack());
            System.out.println("---------");
        }
        System.out.println("\ntotal: " + getCost());
    }
}
