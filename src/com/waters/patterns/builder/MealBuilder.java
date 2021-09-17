package com.waters.patterns.builder;

import com.waters.patterns.builder.items.ChickenBurger;
import com.waters.patterns.builder.items.Cola;
import com.waters.patterns.builder.items.Milk;
import com.waters.patterns.builder.items.VegBurger;

public class MealBuilder {

    public Meal VegBurgerCola(){
        Meal meal = new Meal("VegBurger & Cola");
        meal.addItem(new VegBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public Meal ChickenBurgerMilk(){
        Meal meal = new Meal("ChickenBurger & Milk");
        meal.addItem(new ChickenBurger());
        meal.addItem(new Milk());
        return meal;
    }

}
