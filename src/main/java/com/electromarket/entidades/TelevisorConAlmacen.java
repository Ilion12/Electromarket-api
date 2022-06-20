package com.electromarket.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.EntityListeners;
import com.electromarket.repositorios.TelevisorConAlmacenListener;

import es.electromarket.TelevisorInterfaz;

@Entity
@EntityListeners(TelevisorConAlmacenListener.class)
@Access(value=AccessType.FIELD)
@DiscriminatorValue("TELEVISOR")
public class TelevisorConAlmacen extends ElectrodomesticoConAlmacen implements TelevisorInterfaz {

	
	@Column(name = "TAMAÑO_PANTALLA")
	private int numeroPulgadas;

	@Override
	public int getNumeroPulgadas() {
		return numeroPulgadas;
	}

	@Override
	public void setNumeroPulgadas(int numeroPulgadas) {
		this.numeroPulgadas = numeroPulgadas;
		
	}
	
	public TelevisorConAlmacen() {}
	
	public TelevisorConAlmacen(String marca, String modelo, char calificacionEnergetica, double precio) {
		super(marca, modelo, calificacionEnergetica, precio);
	}
}
