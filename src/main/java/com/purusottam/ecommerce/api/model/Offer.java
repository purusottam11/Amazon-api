package com.purusottam.ecommerce.api.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "offer_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Offer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long categoryId;
    private Long productId;
    private Double percentage;
    private Instant timestamp;

}
