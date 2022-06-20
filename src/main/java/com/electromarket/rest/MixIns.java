package com.electromarket.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {
	
	@JsonPropertyOrder({"idAlmacen", "tipo_producto", "id", "marca", "modelo", "calificacionEnergetica", "precio" })
	public static interface ElectrodomesticoConAlmacen {
		
		
		
		@JsonProperty("idAlmacen")
		String getIdAlmacen();
		
		@JsonProperty("id")
		String getId();
		
		@JsonProperty("marca")
		String getMarca();
		
		@JsonProperty("modelo")
		String getModelo();
		
		@JsonProperty("calificacionEnergetica")
		char getCalificacionEnergetica();
		
		@JsonProperty("precio")
		double getPrecio();
		
		
	}
	
//	public static interface AlmacenConId() {
//		
//	}
//	
//	public static interface TelevisorConId() {
//		
//	}
//	
//	public static interface LavadoraConAlmacen() {
//		
//	}

}
