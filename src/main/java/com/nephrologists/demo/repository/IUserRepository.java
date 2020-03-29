package com.nephrologists.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.UserModel;


@Repository
public interface IUserRepository extends CrudRepository<UserModel, Long>{
		
	@Query()
	List<Object[]> consultarUsuarios();
	
}
