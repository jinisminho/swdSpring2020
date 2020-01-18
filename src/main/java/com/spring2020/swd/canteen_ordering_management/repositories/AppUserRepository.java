package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, BigInteger>
{
}
