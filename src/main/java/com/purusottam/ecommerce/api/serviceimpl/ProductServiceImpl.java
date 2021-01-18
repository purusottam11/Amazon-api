package com.purusottam.ecommerce.api.serviceimpl;

import com.purusottam.ecommerce.api.dto.ProductResponseDto;
import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.repository.CategoryRepository;
import com.purusottam.ecommerce.api.repository.ProductRepository;
import com.purusottam.ecommerce.api.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public ProductResponseDto addProduct(ProductResponseDto productResponseDto) {
        return null;
    }

    @Override
    public ProductResponseDto updateProduct(Long productId, ProductResponseDto productResponseDto) {
        return null;
    }

    @Override
    public ProductResponseDto getProduct(Long productId) {
        return null;
    }

    @Override
    public ProductResponseDto deleteProduct(Long productId) {
        return null;
    }

    @Override
    public List<ProductResponseDto> getProducts() {
        return null;
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return null;
    }

    @Override
    public List<Product> getProductByCategory(Long categoryId) {
        return null;
    }
}
