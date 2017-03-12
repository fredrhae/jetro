package com.jetro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetro.model.Celula;
import com.jetro.model.MembroCelula;
import com.jetro.model.Usuario;
import com.jetro.repository.CelulaRepository;
import com.jetro.repository.MembroCelulaRepository;
import com.jetro.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired 
	MembroCelulaRepository membroCelulaRepository;
	
	@Autowired
	CelulaRepository celulaRepository;
	
	public void save(Usuario pedido) {
		usuarioRepository.save(pedido);
	}

	public Usuario findOne(String id) {
		return usuarioRepository.findOne(id);
	}
	
	public Long findIdCelula(String id){
		MembroCelula membroCelula = findMembroCelulaPorId(id);
		return membroCelula.getIdCelula();
	}
	
	public MembroCelula findMembroCelulaPorId(String id) {
		Usuario usuario = findOne(id);
		MembroCelula membroCelula = membroCelulaRepository.findByIdMembro(usuario.getIdMembro());
		return membroCelula;
	}
	public String findNomeCelula(String id){
		Long idCelula = findIdCelula(id);
		Celula celula = celulaRepository.findOne(idCelula);
		return celula.getNomeCelula();
	}
	
	public Boolean checaUsuarioEstaAtivoNaCelula(String id){
		MembroCelula membroCelula = findMembroCelulaPorId(id);
		if(membroCelula.getIndSituacao().equals("A")){
			return true;
		}
		return false;
	}
}
