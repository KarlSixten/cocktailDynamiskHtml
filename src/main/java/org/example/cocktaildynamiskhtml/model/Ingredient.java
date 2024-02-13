package org.example.cocktaildynamiskhtml.model;

public class Ingredient {
    private String name;
    private boolean containsAlcohol;

    public Ingredient(String name, boolean containsAlcohol) {
        this.name = name;
        this.containsAlcohol = containsAlcohol;
    }

    public String getName() {
        return name;
    }

    public boolean containsAlcohol() {
        return containsAlcohol;
    }
}
