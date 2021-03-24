package com.insurance.service;

import java.util.List;

import com.insurance.model.Insurance;
import com.insurance.model.Health;


public interface HealthService {
	

	public List<Insurance> getAllHealthInsurances();
	public void addInsurance(Insurance i);
    public Insurance updateEmployee(Insurance insurance);
	public Insurance findCustomerId(int id);
	public void delete(int id);
	public Health getAppDetails(Integer courseId);

	
	
	public List<Insurance> getAllInsurances();
	public void save(Insurance insurance);
	public List<Health> getAllApplications();
	public void saveApplication(Health health);
	public void update(int i);
	public void reject(int i);

}
