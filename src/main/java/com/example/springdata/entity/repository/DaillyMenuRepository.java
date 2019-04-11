package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.DaillyMenu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DaillyMenuRepository extends CrudRepository<DaillyMenu, Long> {


}



