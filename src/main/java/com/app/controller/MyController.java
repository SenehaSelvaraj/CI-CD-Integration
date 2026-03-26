package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Fruits;
import com.app.repo.FruitRepo;

@RestController
@RequestMapping("/api/dock")
public class MyController {
	
@Autowired
private FruitRepo fruitrepo;
	
@GetMapping	
public List<Fruits>getSomeNames()
{
	return fruitrepo.findAll();
		
}

@PostMapping
public Fruits addfruits(@RequestBody Fruits fruits) {
 return fruitrepo.save(fruits);

}

}
