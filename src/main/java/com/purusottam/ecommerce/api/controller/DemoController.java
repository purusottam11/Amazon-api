package com.purusottam.ecommerce.api.controller;

import com.purusottam.ecommerce.api.dto.ProductRequestDto;
import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    private final ProductRepository productRepository;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody ProductRequestDto productRequestBean) {
        Product product = new Product();
        BeanUtils.copyProperties(productRequestBean, product);
        return productRepository.save(product);
    }
}
