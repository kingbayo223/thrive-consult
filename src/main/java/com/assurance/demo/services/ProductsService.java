package com.assurance.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.assurance.demo.model.AppointmentModel;
import com.assurance.demo.model.Products;
import com.assurance.demo.repository.ProductsRepo;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepo pro;
	

	 public List<Products> listAll() {
	        return pro.findAll();
	    }
	     
	    public void save(Products add) {
	        pro.save(add);
	    }
	     
	    public Products get(int id) {
	        return pro.findById(id).get();
	    }
	     
	    public void delete(int id) {
	        pro.deleteById(id);
	    }

	    public List<Products> findAll() {
			// TODO Auto-generated method stub
			return  pro.findAll();
		}

		public List<Products> findAll(String productName) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		public Optional<Products> getProById(String productName) {
			// TODO Auto-generated method stub
			return null;
		}
		
	  
			public List<Products> getProductName(String productName)
			{
			return pro.findByProductName(productName);
			}

			 public Optional<Products> getProductById( int productNameId) {
					// TODO Auto-generated method stub
					return pro.findById(productNameId);
				}
			 
				public List<Products> getAmount(double amount)
				{
				return pro.findByAmount(amount);
				}

				
			 public List<Products> findAllProduct() {
			        return pro.findAll();
			    }

			 public List<Products> findAllAmount() {
			        return pro.findAll();
			    }

}
