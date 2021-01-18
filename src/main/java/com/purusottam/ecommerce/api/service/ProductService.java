package com.purusottam.ecommerce.api.service;

import com.purusottam.ecommerce.api.dto.ProductResponseDto;
import com.purusottam.ecommerce.api.model.Product;

import java.util.List;

public interface ProductService {
    ProductResponseDto addProduct(ProductResponseDto productResponseDto);

    ProductResponseDto updateProduct(Long productId, ProductResponseDto productResponseDto);

    ProductResponseDto getProduct(Long productId);

    ProductResponseDto deleteProduct(Long productId);

    List<ProductResponseDto> getProducts();

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductByCategory(Long categoryId);

}
