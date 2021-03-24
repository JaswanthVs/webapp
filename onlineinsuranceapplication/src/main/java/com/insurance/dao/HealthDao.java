package com.insurance.dao;

import java.util.List;

import com.insurance.model.Insurance;
import com.insurance.model.Health;

public interface HealthDao {
	public List<Insurance> getAllInsurances();
	public List<Insurance> getAllHealthInsurances();
	public void addInsurance(Insurance i);
	public void save(Insurance insurance);
    public Insurance updateEmployee(Insurance insurance);
	public Insurance findCustomerId(int id);
	public void delete(int id);
	
	public void saveApplication(Health i);	
	public List<Health> getAllApplications();
	public Health getAppDetails(Integer courseId);
	public void update(int i);
	public void reject(int i);

	
}



