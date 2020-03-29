package com.nephrologists.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.NephrologistTypeModel;


@Repository
public interface INephrologistTypeRepository extends CrudRepository<NephrologistTypeModel, Long>{
		
	@Query()
	List<Object[]> consultarTiposNefrologo();
	
}
