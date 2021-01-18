package com.purusottam.ecommerce.api.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SubCategoryRequestDto {

    private String name;
    private String description;
    private Long parentId;

}
