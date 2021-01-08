package com.purusottam.ecommerce.api.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
@Builder
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
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    private UUID userId;
    private UUID productId;
    private UUID addressId;
    private Instant timestamp;
    private String status;

}
