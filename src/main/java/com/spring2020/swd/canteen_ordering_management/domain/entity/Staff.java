package com.spring2020.swd.canteen_ordering_management.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff
{
    private BigInteger id;
    private BigInteger appuserId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private LocalDate dob;
    private String address;
    private String socialId;
    private LocalDate hireDate;
    private LocalDate terminateDate;
}
