package com.assurance.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assurance.demo.model.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer>{
	// List<Products> findByProductContaining(String productName);

	//List<Products> findByName(String name);
	
	List<Products> findByProductName(String productName);
	
	List<Products> findByAmount(double amount);
	
	//List<Products> findByAmountOrFindByProductName(String productName, double amount);
}
