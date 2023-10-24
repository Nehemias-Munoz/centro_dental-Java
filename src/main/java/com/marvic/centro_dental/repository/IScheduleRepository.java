package com.marvic.centro_dental.repository;

import com.marvic.centro_dental.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface IScheduleRepository extends JpaRepository<Schedule,Integer> {
}
