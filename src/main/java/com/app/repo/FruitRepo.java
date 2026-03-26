package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Fruits;

public interface FruitRepo extends JpaRepository<Fruits,Integer> 
{

}
