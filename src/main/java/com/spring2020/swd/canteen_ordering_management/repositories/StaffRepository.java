package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.Staff;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface StaffRepository extends CrudRepository<Staff, BigInteger>
{
}
