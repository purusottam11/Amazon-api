package com.purusottam.ecommerce.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Order implements Serializable {

    enum Status {
        PLACED,
        DELIVERED,
        EXCHANGED,
        RETURNED,
        CANCELLED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long productId;
    private Long addressId;
    private Instant timestamp;
    private Status status;

}
