package com.nephrologists.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.ClinicTypeModel;


@Repository
public interface IClinicTypeRepository extends CrudRepository<ClinicTypeModel, Long>{
		
	@Query()
	List<Object[]> consultarTiposClinica();
	
}
