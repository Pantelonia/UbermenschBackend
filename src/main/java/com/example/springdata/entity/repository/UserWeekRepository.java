package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.UserWeekInstance;
import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.enums.WeeklyDiet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserWeekRepository extends CrudRepository<UserWeekInstance, Long> {
    Iterable<UserWeekInstance> findAllByUser(Users users);
    UserWeekInstance findByUserAndWeek(Users user, WeeklyDiet week);

}
