package com.electromarket.entidades;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.electromarket.repositorios.AlmacenConIdListener;

import es.electromarket.Almacen;

@Entity
@EntityListeners(AlmacenConIdListener.class)
@Table(name = "ALMACENES")
public class AlmacenConId extends Almacen{
	
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = ElectrodomesticoConAlmacen.class, mappedBy = "almacen")
	private Collection<ElectrodomesticoConAlmacen> electrodomesticos = new ArrayList<ElectrodomesticoConAlmacen>();

	public Collection<ElectrodomesticoConAlmacen> getElectrodomesticos() {
		return electrodomesticos;
	}

	public void setElectrodomesticos(Collection<ElectrodomesticoConAlmacen> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}
	
	public AlmacenConId() {}
	
	public AlmacenConId(Collection<ElectrodomesticoConAlmacen> electrodomesticos) {
		super();
		this.electrodomesticos=electrodomesticos;
	}
	//Establece la relacion en los dos sentidos
	
	public void addElectrodomesticoConAlmacen(ElectrodomesticoConAlmacen electrodomesticoConAlmacen) {
		getElectrodomesticos().add(electrodomesticoConAlmacen);
		electrodomesticoConAlmacen.setAlmacen(this);
	}
	
	

}
