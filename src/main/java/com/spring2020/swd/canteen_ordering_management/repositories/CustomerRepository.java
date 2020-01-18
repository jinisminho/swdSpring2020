package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface CustomerRepository extends CrudRepository<Customer, BigInteger>
{
}
