package com.saroj.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saroj.springframework.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
