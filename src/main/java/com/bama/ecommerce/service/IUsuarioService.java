package com.bama.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.bama.ecommerce.model.Usuario;

public interface IUsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario>findByMail(String mail);
}
