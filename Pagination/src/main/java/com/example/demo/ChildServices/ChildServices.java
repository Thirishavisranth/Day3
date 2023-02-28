package com.example.demo.ChildServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Child;
import com.example.demo.repository.repository;

//import com.example.demo.repository;

//import com.example.demo.Entity.Children;
//import com.example.demo.Repository.ChildrenRepo;


@Service
public class ChildServices {
	
	@Autowired
	private repository repo;

	public Child getChildrenById(int id) {
		
        return repo.findById(id).get();
		
	}
	public List<Child> getChildren()
	{
		List<Child> l = new ArrayList<>();
		l = repo.findAll();
		return l;
	}
	public void addChildren(Child obj)
	{
		repo.save(obj);
	}

	public List<Child> WithPagination(int offset, int pagesize) {
		Pageable p = PageRequest.of(offset,pagesize);
		Page<Child> c = repo.findAll(p);
		return c.toList();
	}
	
	public List<Child> WithPageAndSort(int offset,int pagesize,String field)
	{
		Pageable p = PageRequest.of(offset, pagesize,Sort.by(Sort.Direction.ASC,field));
		Page<Child> c = repo.findAll(p);
		return c.toList();
	}
	
	public void deleteChildren(int id)
	{
		repo.deleteById(id);
	}
	
 

}