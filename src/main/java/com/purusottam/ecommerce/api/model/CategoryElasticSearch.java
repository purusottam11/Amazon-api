package com.purusottam.ecommerce.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Document(indexName = "categoryes")
public class CategoryElasticSearch {
    @Id
    private Long id;
    private String name;
    private Long parentId;
}
