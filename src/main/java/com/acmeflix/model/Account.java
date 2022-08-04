package com.acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Account extends BaseModel{

   private String username;
   private String password;
   private String email;
   private AccountProfile accountProfile;
   private AccountPerson accountPerson;
}
