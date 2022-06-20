package com.electromarket.repositorios;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import com.electromarket.entidades.AlmacenConId;

public class TelevisorConAlmacenDAOImpl implements TelevisorConAlmacenDAOCustom{
	
	TelevisorConAlmacenDAO televisorConAlmacenDAO;
	
	@Autowired
	public TelevisorConAlmacenDAOImpl(@Lazy TelevisorConAlmacenDAO televisorConAlmacenDAO) {
		this.televisorConAlmacenDAO = televisorConAlmacenDAO;
	}
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Set<AlmacenConId> getAlmacenes(String marca, int numeroPulgadas) {
		Set<AlmacenConId> almacenesBuscados= televisorConAlmacenDAO.findByMarcaAndNumeroPulgadas(marca, numeroPulgadas).stream()
				.map(t->t.getAlmacen()).collect(Collectors.toSet());
		return almacenesBuscados;
	}
	
	
		


}
