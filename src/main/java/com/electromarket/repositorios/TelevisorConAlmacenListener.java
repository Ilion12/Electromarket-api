package com.electromarket.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.electromarket.entidades.TelevisorConAlmacen;

public class TelevisorConAlmacenListener {
	
	private Logger log = LoggerFactory.getLogger(TelevisorConAlmacenListener.class);
	private TelevisorConAlmacenDAO televisorConAlmacenDAO;
	
	@Autowired
	public void init(TelevisorConAlmacenDAO televisorConAlmacenDAO) {
		this.televisorConAlmacenDAO = televisorConAlmacenDAO;
	}
	
	
	@PrePersist
	public void preGuardarTelevisor(TelevisorConAlmacen producto) throws Exception {
		if (producto.getNumeroPulgadas() < 0 && producto.getNumeroPulgadas()>100) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El tamaño de la pantalla no piuede ser mayor de 100");
		}
	}
	
	@PreUpdate
	public void preActualizarTelevisor(TelevisorConAlmacen producto) throws Exception {
		if (producto.getNumeroPulgadas() < 0 && producto.getNumeroPulgadas()>20) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El tamaño de la pantalla no piuede ser mayor de 100");
		}
	}

	

}
