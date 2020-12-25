package com.purusottam.ecommerce.api.service;


import com.purusottam.ecommerce.api.model.ProductElasticSearch;

import java.util.List;

public interface ElasticSearchService {
    ProductElasticSearch addProductEs(ProductElasticSearch productEs);

    List<ProductElasticSearch> getAllProductEs();

}
