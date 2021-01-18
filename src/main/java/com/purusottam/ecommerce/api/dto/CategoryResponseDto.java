package com.purusottam.ecommerce.api.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryResponseDto {

    private String name;
    private String description;

}
