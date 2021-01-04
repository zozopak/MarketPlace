package com.example.demo.mapper;

import com.example.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO mapToDTO(Product product);
    Product mapToEntity(ProductDTO productDTO);
}
