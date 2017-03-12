package com.jetro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
}
