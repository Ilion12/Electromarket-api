package com.electromarket.repositorios;




import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.electromarket.entidades.AlmacenConId;

@RepositoryRestResource(path = "almacenes", itemResourceRel = "almacen", collectionResourceRel = "almacenes")
public interface AlmacenConIdDAO extends JpaRepository<AlmacenConId, Long>{
	
	@RestResource(path = "por-localidad")
	Set<AlmacenConId> findByLocalidad(@Param("localidad") String localidad);

	@RestResource(exported=true)
	void delete(AlmacenConId almacenConId);

	

}
