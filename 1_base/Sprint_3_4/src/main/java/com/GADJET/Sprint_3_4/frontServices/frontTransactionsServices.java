package com.GADJET.Sprint_3_4.frontServices;

import com.GADJET.Sprint_3_4.entities.Transaction;
import com.GADJET.Sprint_3_4.repositories.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class frontTransactionsServices {
    @Autowired
    private transactionRepository transactionRepository2;
    public List<Transaction> getAllTransactions() {

        return transactionRepository2.findAll();
    }
}
