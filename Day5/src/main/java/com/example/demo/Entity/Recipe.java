package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RecipesTable")
public class Recipe {
    
	@Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="ADDRESS")
    private String address;
    
    @Column(name="RECIPES")
    private String recipes;
    
    @Column(name="PRICE")
    private float price;
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    
    public Recipe() {}
    public Recipe(int id, String name, String address,String recipes,float price) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
		this.recipes = recipes;
		this.price=price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecipes() {
		return recipes;
	}
	public void setRecipes(String recipes) {
		this.recipes = recipes;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}