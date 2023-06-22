package com.example.springboot.Es3;

import com.example.springboot.Es2.Meal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealCOntroller {

    private static List<Meal> piatti = new ArrayList<Meal>();

    @GetMapping("/mealList")
    public List <Meal> getListMeal() {
        return piatti;
    }

    @PostMapping("/meal")
    public ResponseEntity <?> AddMeal(@RequestBody Meal newMeal) {
        piatti.add(newMeal);
        return new ResponseEntity <String>("aggiunta piatto", HttpStatus.OK);
    }

    @PutMapping("/put/meal/{name}")
    public ResponseEntity <String> upDateMeal(@PathVariable String name,@RequestBody Meal mealUpdated) {
        for ( Meal meal : piatti){
            if (meal.getName().equals(name)) {
                meal.setName(mealUpdated.getName());
                meal.setDescription(mealUpdated.getDescription());
                meal.setPrice(mealUpdated.getPrice());
                return ResponseEntity.ok("Meal updated");
            }
    }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/meal/{name}")
    public ResponseEntity<String> deleteMeal(@PathVariable String name) {
        for (Meal meal : piatti) {
            if (meal.getName().equals(name)) {
                piatti.remove(meal);
                return ResponseEntity.ok("Meal deleted");
            }
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/delete/meal/price/{price}")
    public ResponseEntity<String> deleteMealsAbovePrice(@PathVariable double price) {
        List<Meal> mealsToRemove = new ArrayList<>();
        for (Meal meal : piatti) {
            if (meal.getPrice() > price) {
                mealsToRemove.add(meal);
            }
        }
        piatti.removeAll(mealsToRemove);
        return ResponseEntity.ok("Meal to remove");
    }
}
