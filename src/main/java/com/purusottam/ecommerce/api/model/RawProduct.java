package com.purusottam.ecommerce.api.model;

import lombok.*;
import org.hibernate.id.GUIDGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "raw_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RawProduct {

    @Id
    private String uniq_id;
    private String product_url;
    private String product_name;
    private String product_category_tree;
    private String pid;
    private Integer retail_price;
    private String image;
    private String description;
    private String brand;


}
