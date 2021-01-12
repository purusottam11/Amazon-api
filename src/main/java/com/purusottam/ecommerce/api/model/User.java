package com.purusottam.ecommerce.api.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String firstName;

    private String middleName;

    private String lastName;

    private Long phoneNumber;

    private Long alternativeNumber;

    private String email;

}
