package com.jetro.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetro.model.Membro;
import com.jetro.model.MembroCelula;
import com.jetro.repository.MembroCelulaRepository;
import com.jetro.repository.MembroRepository;

@Service
public class MembroService {
	
	@Autowired
	MembroRepository membroRepository;
	
	@Autowired
	MembroCelulaRepository membroCelulaRepository;
		
	public void save(Membro membro){
		membroRepository.save(membro);
	}
	
	public Membro findOne(Long id){
		return membroRepository.findOne(id);
	}
	
	public Map<Long, String> getListaPreletoresCelula(Long id){
		List<MembroCelula> membroCelulas = membroCelulaRepository.findByIdCelulaAndIndSituacaoAndIndPapel(id, "A", "L");
		Map<Long, String> membrosEncontrados = new HashMap<Long, String>();
		for (MembroCelula membroCelula : membroCelulas) {
			Membro membro = membroRepository.findByIdMembroAndIndSituacao(membroCelula.getIdMembro(), "A");
			if(membro != null) {
				membrosEncontrados.put(membro.getId(), membro.getApelido());
			}
		}
		
		return membrosEncontrados;
	}
	
}
