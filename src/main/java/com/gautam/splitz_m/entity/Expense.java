package com.gautam.splitz_m.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double amount;
    private String userId;
    private String description;
    private String category;
    private String datetime;
    private String location;
    private String paymentMethod;
    @ElementCollection
    private List<String> tags;


}