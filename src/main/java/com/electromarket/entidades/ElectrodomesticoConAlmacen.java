package com.electromarket.entidades;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.electromarket.repositorios.ElectrodomesticoConAlmacenListener;

import es.electromarket.Electrodomestico;

@Entity
@EntityListeners(ElectrodomesticoConAlmacenListener.class)
@Table(name = "ELECTRODOMESTICOS" )
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TIPO_ELECTRODOMESTICO", discriminatorType = DiscriminatorType.STRING)
public class ElectrodomesticoConAlmacen extends Electrodomestico {
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALMACEN", referencedColumnName = "idAlmacen")
	private AlmacenConId almacen;

	public AlmacenConId getAlmacen() {
		return almacen;
	}

	public void setAlmacen(AlmacenConId almacen) {
		this.almacen = almacen;
	}
	
	public ElectrodomesticoConAlmacen() {}

	public ElectrodomesticoConAlmacen(String marca, String modelo, char calificacionEnergetica, double precio) {
		super(marca,modelo,calificacionEnergetica, precio);
	}
	
}
