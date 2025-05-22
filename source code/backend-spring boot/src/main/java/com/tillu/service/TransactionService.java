package com.tillu.service;

import com.tillu.model.Order;
import com.tillu.model.Seller;
import com.tillu.model.Transaction;
import com.tillu.model.User;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
