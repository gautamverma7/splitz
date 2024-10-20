package com.gautam.splitz.repository;

import com.gautam.splitz.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}