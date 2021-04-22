package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.freelanceapp.dao.IAdminDao;
import com.cg.freelanceapp.entities.Admin;

public class AdminImpl implements IAdminService {
	
	@Autowired
	IAdminDao adminDao;
	
	public Admin save(Admin admin)
	{
		return adminDao.save(admin);
	}
	
	@Override
	public Admin update(Admin admin)
	{
		return adminDao.save(admin);
	}
	
	
	
	@Override 
	public Admin findById(Long id)
	{
		return adminDao.findById(id).get();
		
	}
	

}
