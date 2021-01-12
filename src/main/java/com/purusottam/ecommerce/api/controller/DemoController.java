package com.purusottam.ecommerce.api.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.purusottam.ecommerce.api.bean.ProductRequestBean;
import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class DemoController {

    private final ProductRepository productRepository;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody ProductRequestBean productRequestBean) {
        Product product = new Product();
        BeanUtils.copyProperties(productRequestBean, product);
        return productRepository.save(product);
    }
}
