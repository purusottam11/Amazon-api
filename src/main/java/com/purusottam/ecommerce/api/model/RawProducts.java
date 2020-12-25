package com.purusottam.ecommerce.api.model;

import lombok.*;
import org.hibernate.id.GUIDGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "raw_product")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RawProducts {

    @Id
    private String uniq_id;
    private String crawl_timestamp;
    private String product_url;
    private String product_name;
    private String product_category_tree;
    private String pid;
    private Integer retail_price;
    private Integer discounted_price;
    @Lob
    private String image;
    private String is_FK_Advantage_product;
    @Lob
    private String description;
    private String product_rating;
    private String overall_rating;
    private String brand;
    @Lob
    private String Product_specifications;


}
