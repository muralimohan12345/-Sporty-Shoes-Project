package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;



public interface productRepo extends JpaRepository<product, Integer> {
	
}
