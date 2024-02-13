package org.example.cocktaildynamiskhtml.controller;

import org.example.cocktaildynamiskhtml.model.Cocktail;
import org.example.cocktaildynamiskhtml.service.CocktailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cocktails")
public class CocktailController {
    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("")
    public String showAll (Model model){
        List<Cocktail> cocktailList = cocktailService.getCocktails();
        model.addAttribute("cocktailList", cocktailList);
        return "cocktailList";
    }

    @GetMapping("/{cocktailName}")
    public String getCocktailByName(@PathVariable("cocktailName") String cocktailName, Model model) {
        Cocktail cocktail = cocktailService.findCocktail(cocktailName);
        model.addAttribute("cocktail", cocktail.getName());
        model.addAttribute("ingredients", cocktail.getIngredientList());
        return "cocktailDetail";
    }
}
