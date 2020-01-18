package com.spring2020.swd.canteen_ordering_management.repositories;

import com.spring2020.swd.canteen_ordering_management.domain.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepsitory extends CrudRepository<Category, Integer>
{
}
