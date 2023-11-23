package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
