package com.example.springboot.Es5CRUD.Service;

import com.example.springboot.Es5CRUD.Entity.Ingredient;
import com.example.springboot.Es5CRUD.Repository.RepositoryIngrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceIngredient {
    @Autowired
    private RepositoryIngrediente repositoryIngredient;
    public ResponseEntity<?> createingredient (Ingredient ingredient) {
        if (ingredient == null) {
            ResponseEntity.badRequest().body("Ingredient not found");
        }
        repositoryIngredient.save(ingredient);
        return ResponseEntity.ok().body("Ingredient saved successfully");
    }
}
