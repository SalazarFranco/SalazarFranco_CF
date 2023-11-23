package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Usuario;
import com.cibertec.repositorio.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private IUsuarioRepository 	usuarioRepository;
	
	@Override
	public List<Usuario> obtenerTodos(){
		return usuarioRepository.findAll();
	}
	
	@Override
	public Usuario obtenerPorId(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);

	}

}
