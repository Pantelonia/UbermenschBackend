package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.WeeklyDiet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyDietRepository extends CrudRepository<WeeklyDiet, Long> {
}
