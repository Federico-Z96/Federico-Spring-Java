package com.example.springboot.Es4.DAO;

import com.example.springboot.Es2.Meal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDao {
    ArrayList<Meal> meals = new ArrayList<>();
    public MealDao() {
        meals.add(new Meal("Spaghetti alla nerano", "spaghetti,pecorino, zucchine fritte e menta fresca", 10.00));
        meals.add(new Meal("Pizza Margherita", "pomodoro, mozzarella, basilico", 8.00));
        meals.add(new Meal("Insalata russa", "maionese,carote, patate e piselli", 5.00));
    }

    public void addMeal (Meal meal) {
        this.meals.add(meal);
    }

    public void removeMeal (String nameMeal) {
        this.meals.removeIf(meal -> meal.getName().equals(nameMeal));
    }

    public void updateMeal (Meal meal) {
        this.meals.removeIf(m -> m.getName().equals(meal.getName()));
        this.meals.add(meal);
    }

    public List<Meal> getMeals () {
        return this.meals;
    }


}