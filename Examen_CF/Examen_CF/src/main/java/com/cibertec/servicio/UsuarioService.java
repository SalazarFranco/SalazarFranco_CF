package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Usuario;

public interface UsuarioService {
		List<Usuario> obtenerTodos();
		Usuario obtenerPorId(Integer id);
		void guardarUsuario(Usuario usuario);
	
}
