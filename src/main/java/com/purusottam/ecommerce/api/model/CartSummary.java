package com.purusottam.ecommerce.api.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cart_summary_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CartSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long cartId;
    private Long productId;
    private Long addressId;
    private Integer retailPrice;
    private Integer quantity;

}
