package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Recipe;
import com.example.demo.Repository.example;



@Service

public class RecipeService  {

	@Autowired
	private example repo;
	
	public Recipe addRecipes(Recipe obj)
	{
		return repo.save(obj);
	}
	
	public List<Recipe> getRecipes()
	{
		List<Recipe> arr=new ArrayList<>();
		arr=repo.findAll();
		return arr;
	}
	
	public void deleteDepartmentById(int id)
    {
   	 repo.deleteById(id);
    }
    
  public  Recipe update(int id,Recipe s) {
	   return repo.saveAndFlush(s);
  }
}