package com.example.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Schedule;
import com.example.repository.ScheduleRepository;

@Service
@Transactional
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	public void insertSchedule(Schedule schedule) {
		scheduleRepository.save(schedule);
	}
	
	public void updateSchedule(Schedule schedule) {
		scheduleRepository.save(schedule);
	}

	public List<Schedule> getAllSchedules() {
		return scheduleRepository.findAll();
	}
	
	public Schedule getScheduleById(Integer scheduleId) {
		return scheduleRepository.findByScheduleId(scheduleId).get(0);
	}
	
	public void deleteSchedule(Integer scheduleId) {
		scheduleRepository.findById(scheduleId).ifPresent(schedule -> scheduleRepository.delete(schedule));
	}
	
	public List<Schedule> getScheduleByStartDate(Date startDate) {
		return scheduleRepository.findByStartDate(startDate);
	}
	
	

}
