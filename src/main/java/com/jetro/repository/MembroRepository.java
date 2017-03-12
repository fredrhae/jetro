package com.jetro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetro.model.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long>{
	Membro findByIdMembroAndIndSituacao(Long idMembro, String indSituacao);
}
