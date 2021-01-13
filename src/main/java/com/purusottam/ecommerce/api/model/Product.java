package com.purusottam.ecommerce.api.model;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "product_tb")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    @Column(name = "crawl_timestamp")
    private Instant crawlTimestamp;

    @Column(name = "product_url")
    private String productUrl;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category")
    private Long category;

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

