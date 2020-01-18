package com.spring2020.swd.canteen_ordering_management.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser
{
    private BigInteger id;
    private String username;
    private String password;
    private int appRoleId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private char gender;
    private String status;
    private String userType;
    private LocalDate createAt;
    private LocalDate updateAt;
}
