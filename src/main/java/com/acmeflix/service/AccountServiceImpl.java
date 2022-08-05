package com.acmeflix.service;

import com.acmeflix.model.Account;
import com.acmeflix.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public Account findByEmail(final String email) {
        return accountRepository.findAccountByEmail(email);
    }

    @Override
    public JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }
}
