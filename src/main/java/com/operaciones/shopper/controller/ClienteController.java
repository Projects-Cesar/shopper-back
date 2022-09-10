package com.operaciones.shopper.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.ClienteDto;
import com.operaciones.shopper.entity.Cliente;
import com.operaciones.shopper.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	final 
	ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}
	
	
	@PostMapping("/save")
    public ResponseEntity<Cliente> insertarCliente(@RequestBody ClienteDto clienteDto) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre_cliente(clienteDto.getNombre_cliente());
		cliente.setNumero_cuenta(clienteDto.getNumero_cuenta());
		cliente.setDireccion(clienteDto.getDireccion());
		cliente.setSexo(clienteDto.getSexo());
		cliente.setCorreo(clienteDto.getCorreo());
		cliente.setDni(clienteDto.getDni());
		cliente.setTelefono(clienteDto.getTelefono());
		cliente.setEstado(1);
		
		clienteService.GuardarCliente(cliente);
		
		return new ResponseEntity<Cliente>(cliente, null, HttpStatus.CREATED);
	}
	
}
