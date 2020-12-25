package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.ProductElasticSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticSearchRepository extends ElasticsearchRepository<ProductElasticSearch, String> {

}
