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
public class CustomerOrder
{
    private BigInteger id;
    private String location;
    private String note;
    private double totalPrice;
    private BigInteger staffId;
    private BigInteger customerId;
    private int orderStatusId;
    private LocalDateTime craeteAt;
    private LocalDateTime updateAt;
}
