package org.example.cocktaildynamiskhtml.model;

import java.util.List;

public class Cocktail {
    private String name;
    private List<Ingredient> ingredientList;

    public Cocktail(String name, List<Ingredient> ingredientList){
        this.name=name;
        this.ingredientList=ingredientList;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }
}
