package com.example.springboot.Es2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class mealsController {
    public List<Meal> listMeal = Arrays.asList(
            new Meal("Lasagne","piatto tipico Bolognese",13.20),
            new Meal("Pizza","piatto tipico Napoletano",14.60),
            new Meal("Pizza","piatto tipico",12.50),
            new Meal("Pasta Carbonara","piatto tipico Romano", 12.50));



    @GetMapping("/meal")
    public List <Meal> getListMeal() {
        return listMeal;
    }


    @GetMapping("/meal/{name}")
    public Meal getMealByName(@PathVariable String name) {
        for (Meal meal : listMeal) {
            if(meal.getName().equalsIgnoreCase(name)){
                return meal;
            }
        }return null;
    }

    @GetMapping("/meal/description-match/{description}")
    public ResponseEntity <?> GetMealDescription(@PathVariable String description){
        for (Meal meal : listMeal){
            if(meal.getDescription().contains(description)){
                return new ResponseEntity<Meal> (meal, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/meal/price")
    public ResponseEntity <?> getMealPrice(@RequestParam("min") double minPrice, @RequestParam("max") double maxPrice)
    {
        List<Meal> mealPriceRange = new ArrayList<>();
        for (Meal meal : listMeal) {
            if (meal.getPrice() >= minPrice && meal.getPrice() <= maxPrice) {
                mealPriceRange.add(meal);
            }
        }
        if (!mealPriceRange.isEmpty()) {
            return new ResponseEntity<>(mealPriceRange, HttpStatus.OK);
        }
        return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
    }




}
