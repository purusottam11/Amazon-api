package com.purusottam.ecommerce.api.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ProductResponseDto {
    private String productUrl;

    private String productName;

    private Long category;

    private String pid;

    private Integer retailPrice;

    private String description;

    private String brand;
}
