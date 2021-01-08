package com.purusottam.ecommerce.api.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CartSummary {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    private UUID cartId;
    private UUID productId;
    private UUID addressId;
    private Integer retailPrice;
    private Integer quantity;

}
