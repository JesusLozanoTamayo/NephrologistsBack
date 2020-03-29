package com.nephrologists.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nephrologist_base_clinic")
public class NephrologistBaseClinicModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="id_nephrologist")
	private String idNephrologist; 
	@Column(name="id_clinic")
	private String idClinic; 
	@Column(name="salary")
	private String salary;
	@Column(name="dedicationHours")
	private String dedicationHours;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdNephrologist() {
		return idNephrologist;
	}
	public void setIdNephrologist(String idNephrologist) {
		this.idNephrologist = idNephrologist;
	}
	public String getIdClinic() {
		return idClinic;
	}
	public void setIdClinic(String idClinic) {
		this.idClinic = idClinic;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDedicationHours() {
		return dedicationHours;
	}
	public void setDedicationHours(String dedicationHours) {
		this.dedicationHours = dedicationHours;
	}
	
	
	
}
