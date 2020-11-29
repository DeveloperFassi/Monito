package com.cooper.daoracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cooper.entities.FICXINT;
 
 

public interface FICXINTRepository extends JpaRepository<FICXINT, Integer>{
	 
	@Query("select distinct e from FICXINT e where e.FLAXFIC ='E' ")
	public List<FICXINT> ListFICXINTErreur();
	
	
	
	
	@Query("select distinct e from FICXINT e where e.FLAXFIC ='E' ")
	public Page<FICXINT> ListFICXINTErreurPage(Pageable pageable);
	 	
}



