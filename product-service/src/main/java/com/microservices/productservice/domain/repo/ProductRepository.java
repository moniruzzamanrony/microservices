package com.microservices.productservice.domain.repo;

import com.microservices.productservice.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
