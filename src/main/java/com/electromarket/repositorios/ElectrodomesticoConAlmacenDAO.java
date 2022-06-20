package com.electromarket.repositorios;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.electromarket.entidades.ElectrodomesticoConAlmacen;

@RepositoryRestResource(path = "productos", itemResourceRel = "producto", collectionResourceRel = "productos")
public interface ElectrodomesticoConAlmacenDAO  extends JpaRepository<ElectrodomesticoConAlmacen, Long>{
	
	@RestResource(path = "por-marca")
	Collection<ElectrodomesticoConAlmacen> findByMarca(@Param("marca") String marca);
	
	@RestResource(path = "por-modelo")
	Collection<ElectrodomesticoConAlmacen> findByModelo(@Param("modelo") String modelo);
	
	@RestResource(path = "por-precio")
	Collection<ElectrodomesticoConAlmacen> findByPrecio(@Param("precio") double precio);
	
	@RestResource(path = "por-cal_energ")
	Collection<ElectrodomesticoConAlmacen> findByCalificacionEnergetica(@Param("calificacionenergetica") char calificacionEnergetica);

		
}
