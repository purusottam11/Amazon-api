package com.purusottam.ecommerce.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "productes")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductElasticSearch {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long uniqId;
    private String crawlTimestamp;
    private String productUrl;
    private String productName;
    private Long category;
    private String pid;
    private Integer retailPrice;
    private Integer discountedPrice;
    private String image;
    private String isFKAdvantageProduct;
    private String description;
    private String productRating;
    private String overallRating;
    private String brand;
}