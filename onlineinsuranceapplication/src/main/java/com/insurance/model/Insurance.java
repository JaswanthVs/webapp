package com.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String insurance_name;
	private String policy;

	public Insurance() {
	}
	
	public Insurance(Integer id, String insurance_name, String policy) {
		super();
		this.id = id;
		this.insurance_name = insurance_name;
		this.policy = policy;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getInsurance_name() {
		return insurance_name;
	}
	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "Insurance [id=" + id + ", insurance_name=" + insurance_name + ", policy=" + policy + "]";
	}
}

