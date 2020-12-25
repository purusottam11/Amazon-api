package com.purusottam.ecommerce.api.bulkimport;


import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.model.ProductElasticSearch;
import com.purusottam.ecommerce.api.serviceimpl.ElasticSearchServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dataImport")
public class DataImportController {

    Logger log = LoggerFactory.getLogger(DataImportController.class);

    @Autowired
    private DataImportService dataImportService;

    @GetMapping("/importBulkDataToCategory")
    public List<String> importDataToCategoryTable() {
        return dataImportService.importDataToCategoryTable();
    }

    @GetMapping("/importBulkDataToProduct")
    public List<Product> getDataIntoProductTable() {
        return dataImportService.importDataIntoProductTable();
    }

    @Autowired
    private ElasticSearchServiceImpl productEsService;

    @GetMapping("/importProductToElasticSearch")
    public List<ProductElasticSearch> bulkImportToProductEs() {
        List<ProductElasticSearch> list = dataImportService.importDataIntoProductEs();
        log.debug("Response {}", list);
        return list;
    }

}
