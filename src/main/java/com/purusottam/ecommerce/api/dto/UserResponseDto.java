package com.purusottam.ecommerce.api.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponseDto {
    private String userName;

    private String firstName;

    private String middleName;

    private String lastName;

    private Long phoneNumber;

    private Long alternativeNumber;

    private String email;
}
