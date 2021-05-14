package com.example.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{
	
	List<Schedule> findByScheduleId(Integer scheduleId);
	
	List<Schedule> findByStartDate(Date startDate);
}
