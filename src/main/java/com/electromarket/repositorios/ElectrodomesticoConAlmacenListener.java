package com.electromarket.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.electromarket.entidades.ElectrodomesticoConAlmacen;

@Component
public class ElectrodomesticoConAlmacenListener {
	
	private Logger log = LoggerFactory.getLogger(ElectrodomesticoConAlmacenListener.class);
	private ElectrodomesticoConAlmacenDAO electrodomesticoConAlmacenDAO;
	
	@Autowired
	public void init(ElectrodomesticoConAlmacenDAO electrodomesticoConAlmacenDAO) {
		this.electrodomesticoConAlmacenDAO = electrodomesticoConAlmacenDAO;
	}
	
	
	@PrePersist
	public void preGuardarElectrodomestico(ElectrodomesticoConAlmacen producto) throws Exception {
		if (producto.getPrecio() < 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No puede introducir un precio negativo");
		}
	}
	
	@PreUpdate
	public void preActualizarElectrodomestico(ElectrodomesticoConAlmacen producto) throws Exception {
		if (producto.getPrecio() < 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No puede introducir un precio negativo");
		}
	}
}
