package com.electromarket.repositorios;

import java.util.Set;

import com.electromarket.entidades.AlmacenConId;

public interface TelevisorConAlmacenDAOCustom {
	
	Set<AlmacenConId> getAlmacenes(String marca, int numeroPulgadas);

}
