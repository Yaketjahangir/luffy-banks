package com.luffybanks.luffy_banks.repository;


import com.luffybanks.luffy_banks.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
