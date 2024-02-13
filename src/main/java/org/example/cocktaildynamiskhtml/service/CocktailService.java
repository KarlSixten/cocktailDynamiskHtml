package org.example.cocktaildynamiskhtml.service;

import org.example.cocktaildynamiskhtml.model.Cocktail;
import org.example.cocktaildynamiskhtml.repository.CocktailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private CocktailRepository cocktailRepository;

    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }
    public List<Cocktail> getCocktails(){
        return cocktailRepository.getCocktailList();
    }

    public Cocktail findCocktail(String cocktailToFind) {
        return cocktailRepository.findCocktail(cocktailToFind);
    }
}
