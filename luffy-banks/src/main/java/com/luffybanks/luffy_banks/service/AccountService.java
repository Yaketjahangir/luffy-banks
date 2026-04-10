package com.luffybanks.luffy_banks.service;

import com.luffybanks.luffy_banks.model.Account;
import com.luffybanks.luffy_banks.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repo;

    public AccountService(AccountRepository repo) {
        this.repo = repo;
    }

    public Account create(Account account) {
        return repo.save(account);
    }

    public List<Account> getAll() {
        return repo.findAll();
    }
}