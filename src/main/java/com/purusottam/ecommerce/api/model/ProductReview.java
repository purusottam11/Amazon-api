package com.purusottam.ecommerce.api.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product_review_tb")
@Builder
public class ProductReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long productId;

    private String review;

    private Integer starRating;

    private String photoUrl;

}

