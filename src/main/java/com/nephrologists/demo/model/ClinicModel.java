package com.nephrologists.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clinic")
public class ClinicModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="administrator")
	private String administrator;
	@Column(name="email")
	private String email;
	@Column(name="director")
	private String director;
	@Column(name="id_city")
	private String idCity;
	@Column(name="capacity")
	private String capacity;
	@Column(name="id_clinic_type")
	private String idClinicType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getIdCity() {
		return idCity;
	}
	public void setIdCity(String idCity) {
		this.idCity = idCity;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getIdClinicType() {
		return idClinicType;
	}
	public void setIdClinicType(String idClinicType) {
		this.idClinicType = idClinicType;
	}
	
	
	
}
