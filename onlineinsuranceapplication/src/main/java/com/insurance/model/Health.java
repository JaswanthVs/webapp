package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
public class Health {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	

	private String fname ;
	private String lname ;
	private Integer age;
	private String occupation;
	private String state;
	private String appliedon;
	private int adharnumber;
	private String status;
	private String insurance_name;
	private int cibilscore;
	
	
	public Health(Integer id, String fname, String lname, Integer age, String occupation, String state,
			String appliedon, int adharnumber, String status, String insurance_name, int cibilscore) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.occupation = occupation;
		this.state = state;
		this.appliedon = appliedon;
		this.adharnumber = adharnumber;
		this.status = status;
		this.insurance_name = insurance_name;
		this.cibilscore = cibilscore;
	}
	public Health() {}


	@Override
	public String toString() {
		return "Health [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", occupation="
				+ occupation + ", state=" + state + ", appliedon=" + appliedon + ", adharnumber=" + adharnumber
				+ ", status=" + status + ", insurance_name=" + insurance_name + ", cibilscore=" + cibilscore + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getAppliedon() {
		return appliedon;
	}


	public void setAppliedon(String appliedon) {
		this.appliedon = appliedon;
	}


	public int getAdharnumber() {
		return adharnumber;
	}


	public void setAdharnumber(int adharnumber) {
		this.adharnumber = adharnumber;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getInsurance_name() {
		return insurance_name;
	}


	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}


	public int getCibilscore() {
		return cibilscore;
	}


	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}
	
	
	
	

}	