package com.purusottam.ecommerce.api.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryRequestDto {

    private String name;
    private String description;

}
