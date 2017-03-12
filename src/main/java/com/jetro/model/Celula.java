package com.jetro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Celula")
public class Celula {

	@Id
	@Column(name = "IdCelula")
	private Long idCelula;
	
	@Column(name = "NomeCelula")
	private String nomeCelula;
	
	@Column(name = "IdRegiao")
	private Integer idRegiao;
	
	@Column(name = "IndGrupo")
	private String indGrupo;
	
	@Column(name = "Endereco")
	private String endereco;
	
	@Column(name = "Compl")
	private String complemento;
	
	@Column(name = "Bairro")
	private String bairro;
	
	@Column(name = "Anfitriao")
	private String anfitriao;
	
	@Column(name = "DtIInicio")
	private Date dataInicio;
	
	@Column(name = "IndLouvor")
	private String indLouvor;
	
	public Long getIdCelula() {
		return idCelula;
	}
	
	public void setIdCelula(Long idCelula) {
		this.idCelula = idCelula;
	}
	
	public String getNomeCelula() {
		return nomeCelula;
	}
	
	public void setNomeCelula(String nomeCelula) {
		this.nomeCelula = nomeCelula;
	}
	
	public Integer getIdRegiao() {
		return idRegiao;
	}
	
	public void setIdRegiao(Integer idRegiao) {
		this.idRegiao = idRegiao;
	}
	
	public String getIndGrupo() {
		return indGrupo;
	}
	
	public void setIndGrupo(String indGrupo) {
		this.indGrupo = indGrupo;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getAnfitriao() {
		return anfitriao;
	}
	
	public void setAnfitriao(String anfitriao) {
		this.anfitriao = anfitriao;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public String getIndLouvor() {
		return indLouvor;
	}
	
	public void setIndLouvor(String indLouvor) {
		this.indLouvor = indLouvor;
	}
}
