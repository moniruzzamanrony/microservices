package com.microservices.productservice.services;

import com.microservices.productservice.domain.model.Product;
import com.microservices.productservice.domain.repo.ProductRepository;
import com.microservices.productservice.dto.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public String save(ProductDto productDto)
    {
        Product product = new Product();
        product.setPrice(productDto.getPrice());
        product.setName(productDto.getName());
        product.setStock(productDto.getStock());

        productRepository.saveAndFlush(product);
        return "ok";
    }

    public List<Product> getAllProducts() {
       return productRepository.findAll();
    }
}
