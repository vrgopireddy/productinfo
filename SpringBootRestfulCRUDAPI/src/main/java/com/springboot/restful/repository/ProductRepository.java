package com.springboot.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restful.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
