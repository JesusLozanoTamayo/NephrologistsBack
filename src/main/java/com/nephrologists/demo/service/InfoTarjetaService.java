//package com.nephrologists.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.nephrologists.demo.model.InfoTarjetaModel;
//import com.nephrologists.demo.repository.IInfoTarjetaRepository;
//import com.nephrologists.demo.service.interfaces.IInfoTarjetaService;
//
//@Component
//public class InfoTarjetaService implements IInfoTarjetaService{
//
//	private IInfoTarjetaRepository repository;
//	
//	
//	@Autowired
//	public InfoTarjetaService(IInfoTarjetaRepository repository) {
//		super();
//		this.repository = repository;
//	}
//
//	@Override
//	public List<InfoTarjetaModel> findAll() {
//		return (List<InfoTarjetaModel>) repository.findAll();
//	}
//
//	@Override
//	public InfoTarjetaModel findById(Long id) {
//		return repository.findById(id).get();
//	}
//
//	@Override
//	public InfoTarjetaModel save(InfoTarjetaModel entity) {
//		return repository.save(entity);
//	}
//
//}
