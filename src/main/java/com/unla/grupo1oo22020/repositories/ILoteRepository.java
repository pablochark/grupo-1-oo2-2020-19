package com.unla.grupo1oo22020.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo1oo22020.entities.Lote;
import com.unla.grupo1oo22020.entities.Producto;


@Repository("loteRepository")
public interface ILoteRepository extends JpaRepository<Lote, Serializable>{

	public abstract Lote findByIdLote(long idLote);
	
	public abstract Lote findByProducto(Producto producto);	
	
}