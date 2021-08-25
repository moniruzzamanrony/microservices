package com.microservices.productservice.controller;

import com.microservices.productservice.domain.model.Product;
import com.microservices.productservice.dto.ProductDto;
import com.microservices.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
@RequestMapping("api/")
public class ProductController {

    private final ProductService productService;


    @Value("${local.server.port}")
    private String value;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("port")
    public String getMgs()
    {
        return value;
    }

    @PostMapping("save")
    public String save(@RequestBody ProductDto productDto)
    {
        return productService.save(productDto);
    }

    @GetMapping("products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
}
