package com.example.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Schedule;
import com.example.service.ScheduleService;

@RestController
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertSchedule (@RequestBody Schedule schedule) {
		
		System.out.println("date="+schedule.getStart());
		scheduleService.insertSchedule(schedule);
		
	}
	
	@GetMapping("/schedule")
	public List<Schedule> getAllSchedule(){
		
		return scheduleService.getAllSchedules();
	}
	
	@GetMapping("/detail-schedule/{scheduleId}")
	public Schedule getScheduleById (@PathVariable("scheduleId") Integer scheduleId){
		
		return scheduleService.getScheduleById(scheduleId);
	}
	
	@GetMapping("/date-schedule/{startDate}")
	public List<Schedule> getScheduleByStartDate (@PathVariable("startDate") Date startDate){
		return scheduleService.getScheduleByStartDate(startDate);
	}
	
	
	@DeleteMapping("/delete/{scheduleId}")
	public void deleteSchedule(@PathVariable("scheduleId") Integer scheduleId) {
		System.out.println("id"+ scheduleId);
		scheduleService.deleteSchedule(scheduleId);
	}
	
	@PutMapping("/update")
	public void updateSchedule(@RequestBody Schedule schedule) {
		System.out.println("update");
		scheduleService.updateSchedule(schedule);
	}
	
	

}
