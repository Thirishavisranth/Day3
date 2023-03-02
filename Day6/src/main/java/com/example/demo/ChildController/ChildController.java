package com.example.demo.ChildController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Child;
import com.example.demo.ChildServices.ChildServices;

@RestController
public class ChildController {

	@Autowired
	private ChildServices cs;

	@GetMapping("/show")
	public List<Child> getDet() {
		List<Child> arr = new ArrayList<>();
		arr = cs.getChildren();
		return arr;
	}

	@GetMapping("/show/{id}")
	public Child getDetById(@PathVariable int id) {
		return cs.getChildrenById(id);
	}

	@PostMapping("/add")
	public void addDet(@RequestBody Child obj) {
	    cs.addChild(obj);
	    //return "True";
	}

	@GetMapping("/show/{offset}/{pagesize}")
	public List<Child> Pagination(@PathVariable int offset, @PathVariable int pagesize) {
		return cs.WithPagination(offset, pagesize);
	}

	@GetMapping("/show/{offset}/{pagesize}/{field}")
	public List<Child> getSortingAndPagination(@PathVariable int offset, @PathVariable int pagesize,
			@PathVariable String field) {
		return cs.WithPageAndSort(offset, pagesize, field);
	}

	@DeleteMapping("/del/{id}")
	public void delDetails(@PathVariable int id)
	{
		cs.deleteChildren(id);
	}
	

}