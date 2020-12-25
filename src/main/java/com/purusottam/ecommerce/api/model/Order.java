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


    public enum Status {
        PLACED("Placed"), DELIVERED("Delivered"), EXCHANGED("Exchanged"),RETURNED("Return"),CANCELLED("Cancel");

        private String label;

        private Status(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long productId;
    private Long addressId;
    private Instant timestamp;
    private String status;

}
