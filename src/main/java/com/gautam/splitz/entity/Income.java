package com.gautam.splitz.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "incomes")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private IncomeType type;

    private Double amount;
    private String comment;
    private String userId;
}

enum IncomeType {
    SALARY,
    FREELANCING,
    OTHERS
}