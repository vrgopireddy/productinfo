package com.springboot.restful.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restful.model.Product;
import com.springboot.restful.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	
	@Autowired
	private  ProductRepository pRepo;
	
	public List<Product> listAll(){
		return pRepo.findAll();
		
	}
	
	public void save(Product product) {
		pRepo.save(product);
	}
	
	public  Product get(Integer id) {
		return pRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		pRepo.deleteById(id);
	}

}
