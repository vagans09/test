package com.stackroute.findmeclinic.patientauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.findmeclinic.patientauth.exception.PatientAlreadyExistsException;
import com.stackroute.findmeclinic.patientauth.model.Patient;
import com.stackroute.findmeclinic.patientauth.service.PatientService;

@RestController
@RequestMapping("/api/v1/patient")
@CrossOrigin("*")
public class PatientAuthController {
	
	
	private PatientService patientService;
	
	
	@Autowired
	public PatientAuthController(PatientService patientService) {
		this.patientService=patientService;
	}
	
	@PostMapping
	public ResponseEntity<?> registerPatientUser(@RequestBody Patient patient){
		
		ResponseEntity<?> responseEntity= null;
		try {
			patientService.registerPatient(patient);
			responseEntity = new ResponseEntity<>(patient,HttpStatus.CREATED);
		}
		catch(PatientAlreadyExistsException exception) {
			responseEntity = new ResponseEntity<>(exception.getMessage(),HttpStatus.CONFLICT);
		}
		return responseEntity;
	}

}
