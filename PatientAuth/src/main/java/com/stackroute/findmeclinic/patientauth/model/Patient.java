package com.stackroute.findmeclinic.patientauth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	
	
	@Id
	private String patientEmail;
	@Column(unique=true)
	private String patientPhoneNumber;
	private String patientPassword;
	
	public Patient () {
		
	}

	public Patient(String patientEmail, String patientPhoneNumber, String patientPassword) {
		super();
		this.patientEmail = patientEmail;
		this.patientPhoneNumber = patientPhoneNumber;
		this.patientPassword = patientPassword;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientPhoneNumber() {
		return patientPhoneNumber;
	}

	public void setPatientPhoneNumber(String patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	@Override
	public String toString() {
		return "Patient [patientEmail=" + patientEmail + ", patientPhoneNumber=" + patientPhoneNumber
				+ ", patientPassword=" + patientPassword + "]";
	}
	
	
    
}
