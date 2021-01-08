package com.purusottam.ecommerce.api.model;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table
public class Product {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "crawl_timestamp")
    private String crawlTimestamp;

    @Column(name = "product_url")
    private String productUrl;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category")
    private UUID category;

    @Column(name = "pid")
    private String pid;

    @Column(name = "retail_price")
    private Integer retailPrice;

    @Lob
    @Column(name = "description")
    private String description;
    
    @Column(name = "brand")
    private String brand;

}

