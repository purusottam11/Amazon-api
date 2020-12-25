package com.purusottam.ecommerce.api.serviceimpl;

import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.model.ProductElasticSearch;
import com.purusottam.ecommerce.api.repository.ElasticSearchRepository;
import com.purusottam.ecommerce.api.repository.ProductRepository;
import com.purusottam.ecommerce.api.service.ElasticSearchService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {

    @Autowired
    private ElasticSearchRepository productEsRepository;

    @Autowired
    private ProductRepository productRepository;

    List<ProductElasticSearch> list = new ArrayList<>();

    public List<ProductElasticSearch> importDataIntoProductEs() {
        for (Product product : productRepository.findAll()) {
            ProductElasticSearch productEs = new ProductElasticSearch();
            BeanUtils.copyProperties(product, productEs);
            productEsRepository.save(productEs);
            list.add(productEs);
        }
        return list;
    }

    public List<ProductElasticSearch> getAllEsRecord() {
        List<ProductElasticSearch> list = (List<ProductElasticSearch>) productEsRepository.findAll();
        return list;
    }

    @Override
    public ProductElasticSearch addProductEs(ProductElasticSearch productEs) {
        return productEsRepository.save(productEs);
    }

    @Override
    public List<ProductElasticSearch> getAllProductEs() {
        List<ProductElasticSearch> list = new ArrayList<>();
        productEsRepository.findAll().forEach(list::add);
        return list;
    }
}
