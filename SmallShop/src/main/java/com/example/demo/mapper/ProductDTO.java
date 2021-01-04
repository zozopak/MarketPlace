package com.example.demo.mapper;

import com.example.demo.model.Product;

public class ProductDTO implements ProductMapper{
    @Override
    public ProductDTO mapToDTO(Product product) {
        return null;
    }

    @Override
    public Product mapToEntity(ProductDTO productDTO) {
        return null;
    }
}
