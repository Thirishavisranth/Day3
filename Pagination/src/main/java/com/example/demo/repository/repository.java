package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Child;



public interface repository extends JpaRepository<Child,Integer> {

}