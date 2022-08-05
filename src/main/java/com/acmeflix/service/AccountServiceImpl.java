package com.acmeflix.service;

import com.acmeflix.model.Account;
import com.acmeflix.model.AccountPerson;
import com.acmeflix.repository.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
    private AccountRepository accountRepository;
    @Override
    public JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }
    @Override
    public Account findByEmail(final String email) {
        return accountRepository.findAccountByEmail(email);
    }
    @Override
    public Account registerNewPersonAccount(AccountPerson accountPerson) {
        Account account = new Account();
        account.setUsername(accountPerson.getLastName());
        account.setPassword(accountPerson.getPassword());
        account.setUsername(accountPerson.getEmail());
        return accountRepository.save(account);
    }
}
