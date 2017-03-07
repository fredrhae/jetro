package com.jetro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jetro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	@Query(value = "SELECT Usuario.IdUsuario, membrocelula.IdCelula FROM usuario" 
			+ " JOIN membrocelula ON Usuario.IdMembro = membrocelula.IdMembro"
			+ "WHERE Usuario.IdUsuario = :IdUsuario", nativeQuery = true)
	Long findIdCelula(@Param("IdUsuario") String idUsuario);
}
