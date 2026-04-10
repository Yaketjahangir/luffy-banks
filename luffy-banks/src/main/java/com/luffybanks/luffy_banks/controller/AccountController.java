package com.luffybanks.luffy_banks.controller;

import com.luffybanks.luffy_banks.model.Account;
import com.luffybanks.luffy_banks.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return service.create(account);
    }

    @GetMapping
    public List<Account> getAll() {
        return service.getAll();
    }
}
