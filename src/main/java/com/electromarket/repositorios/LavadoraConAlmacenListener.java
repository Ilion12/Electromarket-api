package com.electromarket.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.electromarket.entidades.LavadoraConAlmacen;

public class LavadoraConAlmacenListener {
	
	private Logger log = LoggerFactory.getLogger(LavadoraConAlmacenListener.class);
	private LavadoraConAlmacenDAO lavadoraConAlmacenDAO;
	
	@Autowired
	public void init(LavadoraConAlmacenDAO lavadoraConAlmacenDAO) {
		this.lavadoraConAlmacenDAO = lavadoraConAlmacenDAO;
	}
	
	
	@PrePersist
	public void preGuardarLavadora(LavadoraConAlmacen producto) throws Exception {
		if (producto.getCapacidadCarga() < 0 && producto.getCapacidadCarga()>20) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La Capacidad de Carga no puede ser mayor de 20");
		}
	}
	
	@PreUpdate
	public void preActualizarLavadora(LavadoraConAlmacen producto) throws Exception {
		if (producto.getCapacidadCarga() < 0 && producto.getCapacidadCarga()>20) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La Capacidad de Carga no puede ser mayor de 20");
		}
	}

}
