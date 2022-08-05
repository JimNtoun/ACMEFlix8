package com.acmeflix.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@Builder
public class AccountPerson extends BaseModel{
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String address;
    private String country;
    private String city;
    private String postCode;
    private int age;
}
