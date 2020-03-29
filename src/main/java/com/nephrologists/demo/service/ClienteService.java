package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.ClienteModel;
import com.nephrologists.demo.repository.IClienteRepository;
import com.nephrologists.demo.service.interfaces.IClienteService;

@Component
public class ClienteService implements IClienteService{
	
	
	private IClienteRepository repository;
	
	
	@Autowired
	public ClienteService(IClienteRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<ClienteModel> findAll() {
		return (List<ClienteModel>) repository.findAll();
	}

	@Override
	public ClienteModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public ClienteModel save(ClienteModel entity) {
		return repository.save(entity);
	}

	@Override
	public List<Object[]> consultarClientes() {
		 List<Object[]> consultaAutorizacionDada = repository.consultarClientes();
		 return consultaAutorizacionDada;
	}

}
