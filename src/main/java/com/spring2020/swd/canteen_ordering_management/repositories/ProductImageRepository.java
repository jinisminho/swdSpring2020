package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.ProductImage;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface ProductImageRepository extends CrudRepository<ProductImage, BigInteger>
{
}
