package com.purusottam.ecommerce.api.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubCategoryResponseDto {
    private String name;
    private String description;
    private Long parentId;
}
