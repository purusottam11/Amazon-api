package com.purusottam.ecommerce.api.model;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table
public class Offer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long categoryId;
    private Long productId;
    private Double percentage;
    private Instant timestamp;

}
