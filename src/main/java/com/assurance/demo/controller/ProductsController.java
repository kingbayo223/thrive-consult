package com.assurance.demo.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assurance.demo.model.AppointmentModel;
import com.assurance.demo.model.Products;
import com.assurance.demo.repository.ProductsRepo;
import com.assurance.demo.services.ProductsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductsController {
	
	@Autowired
	private ProductsService pro;
	
	@Autowired
	private ProductsRepo pros;
	
	@PostMapping("/api/products")
	@Transactional
	@CrossOrigin
	public String saveAddItems(@RequestBody Products productsModel) {
	    pro.save(productsModel);
	     
	    return "Hi" +productsModel.getProductName()+ "Registration is successful";
	
	}
	
	@GetMapping("/api/all-production")
	@CrossOrigin
	public Iterable<Products> showAllAppointmentModel(){
		return pro.listAll();
		
	}
	
	 @GetMapping("/api/dept/{id}")
		@CrossOrigin
	    public Optional<Products> getDeptById(
	        @PathVariable(value = "id") int productNameId) {
	         
	        return pro.getProductById(productNameId);
	    }
	
	 @GetMapping("/api/produce")
		@CrossOrigin
		public List<Products> getOffer(){
		 return pro.findAllProduct();
	 }
	 
	 @GetMapping("/api/amount")
		@CrossOrigin
		public List<Products> getamount(){
		 return pro.findAllAmount();
	 }
	 
	@GetMapping("/api/products/product/{productName}")
	@CrossOrigin
	public ResponseEntity<List<Products>> getProductByName(@PathVariable String productName) {
		return new ResponseEntity<List<Products>>(pros.findByProductName(productName), HttpStatus.OK);
	}
	
	@GetMapping("/api/amount/{productName}")
	@CrossOrigin
	public ResponseEntity<List<Products>> getAmount(@PathVariable double amount) {
		return new ResponseEntity<List<Products>>(pros.findByAmount(amount), HttpStatus.OK);
	}
	@GetMapping("/api/products/{productName}")
	@CrossOrigin
	public ResponseEntity<List<Products>> getProduct(@PathVariable String productName) {
		return new ResponseEntity<List<Products>>(pros.findByProductName(productName), HttpStatus.OK);
	}
	
	
}
