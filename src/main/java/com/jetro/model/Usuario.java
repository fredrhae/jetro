package com.jetro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@Column(name = "IdUsuario")
	private String 	id;
	
	@Column(name = "IdIgreja")
	private Long 	idIgreja;
	
	@Column(name = "IdMembro")
	private Long	idMembro;
	
	@Column(name = "NomeUsuario")
	private String	nomeUsuario;
	
	@Column(name = "Senha")
	private String	senha;
	
	@Column(name = "IndAtivo")
	private Integer indAtivo;
	
	@Column(name = "IndAdmin")
	private Integer	indAdmin;
	
	public String getIdUsuario() {
		return id;
	}
	public void setIdUsuario(String idUsuario) {
		this.id = idUsuario;
	}
	
	public Long getIdIgreja() {
		return idIgreja;
	}
	public void setIdIgreja(Long idIgreja) {
		this.idIgreja = idIgreja;
	}
	
	public Long getIdMembro() {
		return idMembro;
	}
	public void setIdMembro(Long idMembro) {
		this.idMembro = idMembro;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Integer getIndAtivo() {
		return indAtivo;
	}
	public void setIndAtivo(Integer indAtivo) {
		this.indAtivo = indAtivo;
	}
	
	public Integer getIndAdmin() {
		return indAdmin;
	}
	public void setIndAdmin(Integer indAdmin) {
		this.indAdmin = indAdmin;
	}
}
