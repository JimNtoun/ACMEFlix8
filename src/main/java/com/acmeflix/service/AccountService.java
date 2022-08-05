package com.acmeflix.service;

import com.acmeflix.model.Account;
import com.acmeflix.model.AccountPerson;

public interface AccountService extends BaseService<Account> {
    Account findByEmail(String email);
    Account registerNewPersonAccount(AccountPerson accountPerson);
}
