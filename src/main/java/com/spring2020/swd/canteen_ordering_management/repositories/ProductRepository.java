package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface ProductRepository extends CrudRepository<Product, BigInteger>
{
}
