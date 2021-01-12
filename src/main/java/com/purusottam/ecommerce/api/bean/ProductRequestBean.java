package com.purusottam.ecommerce.api.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductRequestBean {

    private String productUrl;

    private String productName;

    private Long category;

    private String pid;

    private Integer retailPrice;

    private String description;

    private String brand;

}
