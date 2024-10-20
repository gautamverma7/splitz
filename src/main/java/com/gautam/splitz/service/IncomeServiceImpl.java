package com.gautam.splitz.service.impl;

import com.gautam.splitz.entity.Income;
import com.gautam.splitz.repository.IncomeRepository;
import com.gautam.splitz.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    @Override
    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }

}