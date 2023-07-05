package com.example.springboot.Es5CRUD.Repository;

import com.example.springboot.Es5CRUD.Entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RepositoryIngrediente extends JpaRepository<Ingredient,Long> {

}
