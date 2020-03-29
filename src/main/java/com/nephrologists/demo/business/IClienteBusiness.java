package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.ClienteDTO;
import com.nephrologists.demo.dto.ClienteRequest;
import com.nephrologists.demo.dto.ClienteResponse;
import com.nephrologists.demo.dto.TablaClienteDTO;

public interface IClienteBusiness {

	public ClienteDTO saveClient(ClienteDTO clienteDTO);
	public ClienteResponse saveClientTarget(ClienteRequest clienteRequest);
	public ClienteResponse deleteClient(ClienteRequest clienteRequest);
	public ClienteResponse getClientById(Long id);
	public List<ClienteDTO> consultarCliente();
	public List<TablaClienteDTO> mostrarClientesTabla();
	
	
}
