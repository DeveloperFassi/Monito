package com.cooper.daoracle;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

import com.cooper.entities.FICXINT;

public interface UserRepository extends DataTablesRepository<FICXINT, Integer>{

}
