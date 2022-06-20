package com.electromarket.repositorios;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.electromarket.entidades.TelevisorConAlmacen;

@RepositoryRestResource(path = "televisores", itemResourceRel = "televisor", collectionResourceRel = "televisores")
public interface TelevisorConAlmacenDAO extends JpaRepository<TelevisorConAlmacen, Long>, TelevisorConAlmacenDAOCustom{
	
	@RestResource(path = "por-numeroPulgadas")
	Collection<TelevisorConAlmacen> findByNumeroPulgadas(@Param("numeroPulgadas") int pulgadas);
	@RestResource(path = "por-marca")
	Collection<TelevisorConAlmacen> findByMarca(@Param("marca") String marca);
	@RestResource(path = "por-marca&&pulgadas")
	Collection<TelevisorConAlmacen> findByMarcaAndNumeroPulgadas(@Param("marca") String marca, @Param("numeroPulgadas") int numeroPulgadas);
	
	
}
