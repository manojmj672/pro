//package com.flight.project.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.flight.project.dto.Schedule;
//import com.flight.project.servicelayer.ScheduleServiceImpl;
//
//@RestController
//@RequestMapping("/schedule")
//public class ScheduleController {
//	private ScheduleServiceImpl scheduleService;
//	public ScheduleController(ScheduleServiceImpl scheduleService) {
//		super();
//		this.scheduleService = scheduleService;
//	}
//
//	@PostMapping()
//    public ResponseEntity<Schedule> saveSchedule(@RequestBody Schedule schedule){
//        return new ResponseEntity<Schedule>(scheduleService.saveSchedule(schedule), HttpStatus.CREATED);
//        
//    }
//}
