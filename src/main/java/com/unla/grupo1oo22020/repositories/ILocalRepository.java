package com.unla.grupo1oo22020.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.grupo1oo22020.entities.Local;


@Repository("localRepository")
public interface ILocalRepository extends JpaRepository<Local, Serializable>{
	public abstract Local findByIdLocal(long idLocal);
	
	// Todas las personas que tengan un título con ese nombre (parámetro name)
	//	@Query("SELECT local FROM Local local JOIN FETCH local.lotes lote WHERE lote.idLote = (:idLote)")
	//public abstract List<Local> findByIdLote(long idLote);



}