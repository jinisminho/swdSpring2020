package com.spring2020.swd.canteen_ordering_management.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage
{
    private BigInteger id;
    private BigInteger productId;
    private String imgUrl;
}
