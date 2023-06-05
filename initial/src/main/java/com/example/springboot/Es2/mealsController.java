package com.example.springboot.Es2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;





import java.util.Arrays;
import java.util.List;

@RestController
public class mealsController {
    public List<Meal> listMeal = Arrays.asList(
            new Meal("Lasagne","piatto tipico Bolognese",13.20),
            new Meal("Pizza","piatto tipico Napoletano",14.60),
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




}
