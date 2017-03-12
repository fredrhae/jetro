package com.jetro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetro.model.MembroCelula;

public interface MembroCelulaRepository extends JpaRepository<MembroCelula, Long>{
	MembroCelula findByIdMembro(Long idMembro);
	List<MembroCelula> findByIdCelula(Long idCelula);
	List<MembroCelula> findByIdCelulaAndIndSituacaoAndIndPapel(Long idCelula, String indSituacao, String indPapel);

}
