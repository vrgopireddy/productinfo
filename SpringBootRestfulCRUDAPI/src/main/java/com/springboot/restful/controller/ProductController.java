package com.springboot.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restful.model.Product;
import com.springboot.restful.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pService;

	@GetMapping("/products")
//	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> productsList() {
		return pService.listAll();
	}

	@GetMapping("/products/{id}")
//	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> getById(@PathVariable Integer id) {
		Product product = pService.get(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@PostMapping("/products")
//	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		pService.save(product);
	}

	
	  @PutMapping("/products/{id}")
	  public ResponseEntity<Product>updateById(@RequestBody Product product,@PathVariable Integer id)
	  {
		  Product currentProduct = pService.get(id); 
		  pService.save(product);
		  return new ResponseEntity<>(currentProduct,HttpStatus.OK);
	  
	  }
	 

	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		pService.delete(id);
		
	}

}
