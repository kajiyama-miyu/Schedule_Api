package com.example.domain;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "`schedules`")
public class Schedule {

	@Id
	@Column(name = "schedule_id", columnDefinition = "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer scheduleId;
	
	 @Column(name = "start_date", columnDefinition = "date")
		private Date startDate;
		
		@Column(name = "end_date", columnDefinition = "date")
		private Date endDate;
		
		@Column(name = "start_time", columnDefinition = "timestamp with time zone")
		private Timestamp start;
		
		@Column(name = "end_time", columnDefinition = "timestamp with time zone")
		private Timestamp end;
		
		@Column(name = "new_event", columnDefinition = "text")
		private String event;
		
		@Column(name = "category_num", columnDefinition = "integer")
		private Integer categoryNum;
		
		@Column(name = "place", columnDefinition = "text")
		private String place;
		
		@Column(name = "memo", columnDefinition = "text")
		private String memo;
}
