package com.stackroute.findmeclinic.patientauth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.findmeclinic.patientauth.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {

	public Patient findPatientBypatientPhoneNumber(String patientPhoneNumber);
}
