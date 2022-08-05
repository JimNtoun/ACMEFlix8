package com.acmeflix.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;


@Setter
@Getter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseModel{
   private String username;
   private String password;
   private String email;
   private Set<AccountProfile> accountProfiles;
   private AccountPerson accountPerson;
   private int subscription;

}
