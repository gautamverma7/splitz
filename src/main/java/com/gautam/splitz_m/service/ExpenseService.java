package com.gautam.splitz_m.service;

import com.gautam.splitz_m.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense addExpense(Expense expense);
    List<Expense> getExpensesByUserId(String userId);
}