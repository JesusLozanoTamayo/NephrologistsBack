package com.nephrologists.demo.model;

import java.math.BigInteger;

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
	private Long idCity;
	
	@Column(name="capacity")
	private BigInteger capacity;
	
	@Column(name="id_clinic_type")
	private Long idClinicType;
	
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
	public Long getIdCity() {
		return idCity;
	}
	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}
	public BigInteger getCapacity() {
		return capacity;
	}
	public void setCapacity(BigInteger capacity) {
		this.capacity = capacity;
	}
	public Long getIdClinicType() {
		return idClinicType;
	}
	public void setIdClinicType(Long idClinicType) {
		this.idClinicType = idClinicType;
	}
	
	
	
}
