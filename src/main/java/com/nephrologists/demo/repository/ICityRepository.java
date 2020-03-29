package com.nephrologists.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.CityModel;


@Repository
public interface ICityRepository extends CrudRepository<CityModel, Long>{
		
	@Query()
	List<Object[]> consultarCiudades();
	
}
