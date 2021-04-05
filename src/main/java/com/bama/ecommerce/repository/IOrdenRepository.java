package com.bama.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bama.ecommerce.model.Orden;
import com.bama.ecommerce.model.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{
	
	List<Orden> findByUsuario (Usuario usuario);
	
}
