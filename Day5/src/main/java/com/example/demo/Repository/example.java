package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Recipe;

public interface example extends JpaRepository<Recipe,Integer> {
   
}