package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.service.IJobService;


@RestController
@RequestMapping("portal/job")
public class JobController {
	
	@Autowired
	IJobService jobService;
		
	@PostMapping("/add")
	public ResponseEntity<Object> job(@RequestBody Job job) {
		
		jobService.close(job);
		return new ResponseEntity<>("Job Successfully", HttpStatus.ACCEPTED);
	}
}


