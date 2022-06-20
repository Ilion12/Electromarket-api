package com.electromarket.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;
import javax.persistence.EntityListeners;

import com.electromarket.repositorios.LavadoraConAlmacenListener;

import es.electromarket.LavadoraInterfaz;

@Entity
@EntityListeners(LavadoraConAlmacenListener.class)
@Access(value=AccessType.FIELD)
@DiscriminatorValue("LAVADORA")
public class LavadoraConAlmacen extends ElectrodomesticoConAlmacen implements LavadoraInterfaz {
	
	@Column( name = "CAPACIDAD_DE_CARGA")
	private int capacidadCarga;

	
	@Override
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	@Override
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
		
	}
	
	public LavadoraConAlmacen() {}
	
	public LavadoraConAlmacen(String marca, String modelo, char calificacionEnergetica, double precio) {
		super(marca, modelo, calificacionEnergetica, precio);
		
	}

}
