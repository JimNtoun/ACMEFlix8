package com.acmeflix.Service;

import com.acmeflix.model.Account;
import com.acmeflix.Service.BaseService;

public interface AccountService extends BaseService<Account> {
    Account findByEmail(String email);
}
