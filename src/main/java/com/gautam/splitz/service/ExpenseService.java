package com.gautam.splitz.service;

import com.gautam.splitz.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense addExpense(Expense expense);
    List<Expense> getExpensesByUserId(String userId);
}