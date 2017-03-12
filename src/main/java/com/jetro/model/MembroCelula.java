package com.jetro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "MembroCelula")
public class MembroCelula {

	@Id
	@Column(name = "IdMembroCelula")
	private Long id;
	
	@Column(name = "IdMembro")
	private Long idMembro;
	
	@Column(name = "IdCelula")
	private Long idCelula;
	
	@Column(name = "IndPapel")
	private String indPapel;
	
	@Column(name = "IndMinLouvor")
	private Integer indMinLouvor;
	
	@Column(name = "IndAnfitriao")
	private Integer indAnfitriao;
	
	@Column(name = "IndSituacao")
	private String indSituacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdMembro() {
		return idMembro;
	}

	public void setIdMembro(Long idMembro) {
		this.idMembro = idMembro;
	}

	public Long getIdCelula() {
		return idCelula;
	}

	public void setIdCelula(Long idCelula) {
		this.idCelula = idCelula;
	}

	public String getIndPapel() {
		return indPapel;
	}

	public void setIndPapel(String indPapel) {
		this.indPapel = indPapel;
	}

	public Integer getIndMinLouvor() {
		return indMinLouvor;
	}

	public void setIndMinLouvor(Integer indMinLouvor) {
		this.indMinLouvor = indMinLouvor;
	}

	public Integer getIndAnfitriao() {
		return indAnfitriao;
	}

	public void setIndAnfitriao(Integer indAnfitriao) {
		this.indAnfitriao = indAnfitriao;
	}

	public String getIndSituacao() {
		return indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}
}
