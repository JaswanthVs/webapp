package com.insurance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.model.Insurance;

import com.insurance.model.Health;


@Repository
public class HealthDaoImpl implements HealthDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public void saveApplication(Health i) {
		System.out.println("adding");
		Session session = sessionFactory.openSession();

		session.saveOrUpdate(i);
	}

	public List<Insurance> getAllInsurances() {

		Session session = sessionFactory.openSession();
		String queary = "from Insurance";
		System.out.println("Insurances Displayed");
		return session.createQuery(queary).list();
	}
	
	public List<Insurance> getAllHealthInsurances() {

		Session session = sessionFactory.openSession();
		String queaary = "from Insurance i where i.insurance_name='health'";
		System.out.println("Insurances Displayed");
		return session.createQuery(queaary).list();
	}

	
	
	public void addInsurance(Insurance i) {
		Session session = sessionFactory.openSession();

		session.saveOrUpdate(i);
	}

	
	
	public void save(Insurance insurance) {
		System.out.println("Adding new Insurance");
		Session session = sessionFactory.getCurrentSession();
		session.save(insurance);

	}
	
	public List<Health> getAllApplications() {
		
		Session session = sessionFactory.openSession();
		String queary = "from Health";
		System.out.println("Applications Displayed");
		return session.createQuery(queary).list();

	}
	
	
//	public void saveUserForm(User user) {
//		Session session = sessionFactory.openSession();
//
//		session.saveOrUpdate(user);
//
//
//	}
	
	

	public Insurance updateEmployee(Insurance insurance) {
		sessionFactory.getCurrentSession().update(insurance);
		return insurance;
	}

	public Insurance findCustomerId(int id) {

		return (Insurance) sessionFactory.getCurrentSession().get(Insurance.class, id);

	}

	
	public void delete(int id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Insurance f = session.get(Insurance.class, id);
			session.delete(f);
			session.getTransaction().commit();

		} finally {
			if (session != null)
				session.close();

		}


	}


	public Health getAppDetails(Integer courseId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();

			Health f = session.get(Health.class, courseId);
			session.getTransaction().commit();
			return f;
		} finally {
			if (session != null)
				session.close();
		}

	}

	public void update(int id) {

		Session session = sessionFactory.openSession();
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Health f = session.get(Health.class, id);
			f.setStatus("Approved");
			session.getTransaction().commit();

		} finally {
			if (session != null)
				session.close();

		}
		
		
	}

	public void reject(int i) {
		Session session = sessionFactory.openSession();
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Health f = session.get(Health.class, i);
			f.setStatus("Rejected");
			session.getTransaction().commit();

		} finally {
			if (session != null)
				session.close();

		
	}

	
	
	
	//Health Insurance------------------------------>
	
	
	
	
	
	
	
	}
}
