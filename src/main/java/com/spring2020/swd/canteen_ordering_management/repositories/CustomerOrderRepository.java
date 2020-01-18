package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, BigInteger>
{
}
