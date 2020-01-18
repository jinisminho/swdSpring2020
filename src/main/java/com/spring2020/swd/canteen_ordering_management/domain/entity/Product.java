package com.spring2020.swd.canteen_ordering_management.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    private BigInteger id;
    private String name;
    private double price;
    private String description;
    private int categoryId;
    private boolean isAvailable;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
