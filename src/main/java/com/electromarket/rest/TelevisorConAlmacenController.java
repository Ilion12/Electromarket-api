package com.electromarket.rest;

import java.util.Set;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.electromarket.entidades.AlmacenConId;
import com.electromarket.repositorios.TelevisorConAlmacenDAO;


@RepositoryRestController
public class TelevisorConAlmacenController {
	
	TelevisorConAlmacenDAO televisorConAlmacenDAO;
	
	public TelevisorConAlmacenController(TelevisorConAlmacenDAO televisorConAlmacenDAO) {
		this.televisorConAlmacenDAO = televisorConAlmacenDAO;
	}
	@GetMapping("televisores/search/buscar-productos")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getAlmacenes(@RequestParam("marca") String marca, @RequestParam("numeroPulgadas") int numeroPulgadas, 
			PersistentEntityResourceAssembler assembler ){
		Set<AlmacenConId> almacenes = televisorConAlmacenDAO.getAlmacenes(marca, numeroPulgadas);
		return assembler.toCollectionModel(almacenes);
	}
	
	

}
