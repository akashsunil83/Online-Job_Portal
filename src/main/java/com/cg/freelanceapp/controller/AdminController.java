package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.service.IAdminService;


@RestController
@RequestMapping("portal/admin")
public class AdminController {
	
	@Autowired
	IAdminService adminService;
		
	@PostMapping("/add")
	public ResponseEntity<Object> job(@RequestBody Admin admin) {
		
		adminService.save(admin);
		return new ResponseEntity<>("Admin Successfully", HttpStatus.ACCEPTED);
	}
}