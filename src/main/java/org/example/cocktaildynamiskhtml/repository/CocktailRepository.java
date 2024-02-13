package org.example.cocktaildynamiskhtml.repository;

import org.example.cocktaildynamiskhtml.model.Cocktail;
import org.example.cocktaildynamiskhtml.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CocktailRepository {
    private List<Cocktail> cocktailList;

    public CocktailRepository() {
        populateCocktailList();
    }

    private void populateCocktailList() {
        cocktailList = List.of(
                new Cocktail("Vand", List.of(
                new Ingredient("Vand", false))),

                new Cocktail("Vodka Redbull", List.of(
                new Ingredient("Vodka", true),
                new Ingredient("Redbull", false))));
    }

    public List<Cocktail> getCocktailList(){
        return cocktailList;
    }
    public Cocktail findCocktail(String cocktailToFind){
        for (Cocktail cocktail : cocktailList){
            if (cocktail.getName().equalsIgnoreCase(cocktailToFind)){
                return cocktail;
            }
        }
        return null;
    }

}
