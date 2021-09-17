package com.waters.patterns.builder;

public class Main {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.VegBurgerCola();
        meal.getMeal();

        Meal meal1 = mealBuilder.ChickenBurgerMilk();
        meal1.getMeal();
    }
}
