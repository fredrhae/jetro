package com.jetro.repository;

import com.jetro.model.Celula;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jetro.model.Relatorio;

import java.util.List;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long>{
    List<Relatorio> findByCelula(Celula celula);
}
