package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.insurance.dao.HealthDao;
import com.insurance.model.Insurance;
import com.insurance.model.Health;


@Service
public class HealthServiceImpl implements HealthService {
	
	@Autowired
	private HealthDao customerdao;
	
	
	@Autowired
	private HealthDao healthDao;
	@Transactional
	public void saveApplication(Health health) {
	

			healthDao.saveApplication(health);
			
		}
	
	
	@Transactional
	public List<Health> getAllApplications() {
		
		return healthDao.getAllApplications();
	}
	
	
	@Transactional
	public List<Insurance> getAllInsurances() {
		
		return customerdao.getAllInsurances();
	}
	
	@Transactional
	public List<Insurance> getAllHealthInsurances() {
		
		return customerdao.getAllHealthInsurances();
	}
	
	
	@Transactional
	public void addInsurance(Insurance i) {
		customerdao.addInsurance(i);
		
	}

    @Transactional
	public void save(Insurance insurance) {
		customerdao.save(insurance);
		
	}
//    
//    @Transactional
//	public void saveUserForm(User user) {
//    	customerdao.saveUserForm(user);
//		
//	}
    public Insurance updateEmployee(Insurance insurance) {
        return customerdao.updateEmployee(insurance);
    }


	public Insurance findCustomerId(int id) {
		return customerdao.findCustomerId(id);
	}



		
	@Transactional
	public void delete(int id) {
		customerdao.delete(id);
		
	}
	
	public Health getAppDetails(Integer courseId) {
		return customerdao.getAppDetails(courseId);
	}


	public void update(int i) {
		customerdao.update(i);
		
	}


	public void reject(int i) {
		customerdao.reject(i);
		
	}



	

}
