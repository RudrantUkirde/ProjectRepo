package com.example.repo;

import com.example.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<TransactionEntity,Long> {

    TransactionEntity findByTxnId(String txnId);
}
