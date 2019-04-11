package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.DaillyMenuWeekRateInstance;
import com.example.springdata.entity.enums.WeeklyDiet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  WeeklyMenuRepository extends CrudRepository<DaillyMenuWeekRateInstance, Long> {
    Iterable<DaillyMenuWeekRateInstance> findAllByWeek(WeeklyDiet week);
}
