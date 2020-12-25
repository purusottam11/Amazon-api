package com.purusottam.ecommerce.api.bulkimport;


import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.model.ProductElasticSearch;

import java.util.List;

public interface DataImportService {

    List<String> importDataToCategoryTable();

    List<Product> importDataIntoProductTable();

    public List<ProductElasticSearch> importDataIntoProductEs();


}
