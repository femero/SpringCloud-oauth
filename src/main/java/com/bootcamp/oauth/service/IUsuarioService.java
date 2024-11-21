package com.bootcamp.oauth.service;

import com.bootcamp.usuarioscommons.model.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
