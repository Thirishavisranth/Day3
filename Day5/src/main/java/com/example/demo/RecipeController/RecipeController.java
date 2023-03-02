package com.example.demo.RecipeController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Recipe;
import com.example.demo.Service.RecipeService;


@RestController

public class RecipeController {

	@Autowired
	private RecipeService Sserve;
	
	@PostMapping("/add")
	public Recipe postRecipes(@RequestBody Recipe r)
	{
		return Sserve.addRecipes(r);
	}
	
	@GetMapping("/show")
	public List<Recipe> showRecipes()
	{
		List<Recipe> a = new ArrayList<>();
		a = Sserve.getRecipes();
		return a;
	}
	
	@DeleteMapping ("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		Sserve.deleteDepartmentById(id);
	}
	@PutMapping("/update/{id}")
      public  Recipe  update(@PathVariable int id,@RequestBody Recipe s) {
    	  return Sserve.update(id, s);
      }
	
}