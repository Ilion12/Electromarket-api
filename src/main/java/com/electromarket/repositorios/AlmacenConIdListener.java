package com.electromarket.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.electromarket.entidades.AlmacenConId;

public class AlmacenConIdListener {
	
	private Logger log = LoggerFactory.getLogger(AlmacenConIdListener.class);
	private AlmacenConIdDAO almacenConIdDAO;
	
	@Autowired
	public void init(AlmacenConIdDAO almacenConIdDAO) {
		this.almacenConIdDAO = almacenConIdDAO;
	}
	
	
	@PrePersist
	public void preGuardarAlmacen(AlmacenConId almacen) throws Exception {
		if (almacen.getLocalidad() != null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Este almacen ya existe");
		}
	}
	
	@PreUpdate
	public void preActualizarAlmacen(AlmacenConId almacen) throws Exception {
		if (almacen.getLocalidad() !=null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ya existe un almacen "
					+ "con ese nombre");
		}

	}
}