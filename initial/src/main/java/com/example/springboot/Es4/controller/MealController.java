package com.example.springboot.Es4.controller;

import com.example.springboot.Es2.Meal;
import com.example.springboot.Es4.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealController {

    private MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/mealsList")
    public List<Meal> getMeals() {
        return mealService.getMealList();
    }

    @PostMapping("/aMeal")
    public ResponseEntity<String> addMeal(@RequestBody Meal newMeal) {
        mealService.addMeal(newMeal);
        return ResponseEntity.ok("Add a new meal");
    }

    @PutMapping("/put/meals/{name}")
    public ResponseEntity<String> updateMeal(@PathVariable String name, @RequestBody Meal updatedMeal) {
        mealService.updateMeal(name, updatedMeal);
        return ResponseEntity.ok("Meal updated");
    }

    @DeleteMapping("/delete/meals/{name}")
    public ResponseEntity<String> deleteMeal(@PathVariable String name) {
        mealService.deleteMeal(name);
        return ResponseEntity.ok("Meal deleted");
    }

    @DeleteMapping("/delete/meal/prices/{price}")
    public ResponseEntity<String> deleteMealsAbovePrice(@PathVariable double price) {
        mealService.deleteMealsAbovePrice(price);
        return ResponseEntity.ok("Meals removed");
    }

    @PutMapping("/update/meal/{name}/price")
    public ResponseEntity<String> updateMealPrice(@PathVariable String name, @RequestBody Double updatedPrice) {
        mealService.updateMealPrice(name, updatedPrice);
        return ResponseEntity.ok("Meal price updated");
    }
}
