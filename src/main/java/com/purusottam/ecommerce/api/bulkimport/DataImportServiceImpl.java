package com.purusottam.ecommerce.api.bulkimport;

import com.purusottam.ecommerce.api.model.Category;
import com.purusottam.ecommerce.api.model.Product;
import com.purusottam.ecommerce.api.model.ProductElasticSearch;
import com.purusottam.ecommerce.api.model.RawProducts;
import com.purusottam.ecommerce.api.repository.CategoryRepository;
import com.purusottam.ecommerce.api.repository.ElasticSearchRepository;
import com.purusottam.ecommerce.api.repository.ProductRepository;
import com.purusottam.ecommerce.api.repository.RawProductRepository;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class DataImportServiceImpl implements DataImportService {

    private final RawProductRepository rawProductRepository;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ElasticSearchRepository elasticSearchRepository;

    @Override
    public List<String> importDataToCategoryTable() {
        List<String> list = new ArrayList<>();
        List<RawProducts> flipkartProductsList = rawProductRepository.findAll();
        int c = 0;
        for (RawProducts flipkartProducts : flipkartProductsList) {
            String string = flipkartProducts.getProduct_category_tree();

            List<String> categories = Arrays.asList(string.toString().split(">>"));

            long id = -1;
            String previous = "";
            for (int i = 0; i < categories.size(); i++) {
                String s = categories.get(i);
                StringBuilder stringBuilder1 = new StringBuilder(s);
                stringBuilder1.deleteCharAt(0);
                s = stringBuilder1.toString();
                if (i == 0) {
                    if (categoryRepository.findByName(s) == null) {
                        Category category = new Category();
                        category.setName(s);
                        categoryRepository.save(category);
                        list.add(s);
                    }
                    previous = s;
                } else {
                    if (categoryRepository.findByName(s) == null) {
                        Category category = new Category();
                        category.setName(s);
                        if (categoryRepository.findByName(previous) != null) {
                            category.setParentId(categoryRepository.findByName(previous).get().getId());
                        }
                        categoryRepository.save(category);
                        list.add(s);
                    }
                    previous = s;
                }
            }
        }
        return list;
    }

    @Override
    public List<Product> importDataIntoProductTable() {
        List<Product> productList = new ArrayList<>();
        List<RawProducts> flipkartProductsList = rawProductRepository.findAll();
        for (RawProducts flipkartProducts : flipkartProductsList) {
            Product product = new Product();
            product.setCrawlTimestamp(flipkartProducts.getCrawl_timestamp());
            product.setProductUrl(flipkartProducts.getProduct_url());
            product.setProductName(flipkartProducts.getProduct_name());
            product.setPid(flipkartProducts.getPid());
            product.setRetailPrice(flipkartProducts.getRetail_price());
            product.setDiscountedPrice(flipkartProducts.getDiscounted_price());
            product.setIsFKAdvantageProduct(flipkartProducts.getIs_FK_Advantage_product());
            product.setDescription(flipkartProducts.getDescription());
            product.setProductRating(flipkartProducts.getProduct_rating());
            product.setOverallRating(flipkartProducts.getOverall_rating());
            product.setBrand(flipkartProducts.getBrand());
            //CopyDataUtils.copySafe(flipkartProducts, product);
            String string = flipkartProducts.getProduct_category_tree();
            List<String> categories = Arrays.asList(string.toString().split(">>"));

            String previous = "";
            for (int i = 0; i < categories.size(); i++) {
                String s = categories.get(i);
                StringBuilder stringBuilder1 = new StringBuilder(s);
                stringBuilder1.deleteCharAt(0);
                s = stringBuilder1.toString();
                if (i == 0) {
                    previous = s;
                } else {
                    previous = s;
                }
            }

            product.setCategory(categoryRepository.findByName(previous).get().getId());
            productRepository.save(product);
            productList.add(product);
        }
        return productList;
    }

    List<ProductElasticSearch> list = new ArrayList<>();

    public List<ProductElasticSearch> importDataIntoProductEs() {
        for (Product product : productRepository.findAll()) {
            ProductElasticSearch productEs = new ProductElasticSearch();
            BeanUtils.copyProperties(product, productEs);
            elasticSearchRepository.save(productEs);
            list.add(productEs);
        }
        return list;
    }
}
