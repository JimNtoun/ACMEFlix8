package com.acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Set;


@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Account extends BaseModel{
   private String username;
   private String password;
   private String email;
   private Set<AccountProfile> accountProfiles;
   private AccountPerson accountPerson;
   private int subscription;
}
