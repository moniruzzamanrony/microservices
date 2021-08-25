package com.microservices.productservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
    private String name;
    private String price;
    private int stock;
}
