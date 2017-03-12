package com.jetro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity( name = "CelulaRel")
public class Relatorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdCelulaRel")
	private Long idRelatorio;

	@Column(name = "IdCelula")
	private Long idCelula;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "Data")
	private Date data;
	
	@Column(name = "HrInicio")
	private String horaInicio;
	
	@Column(name = "HrFim")
	private String horaFim;
	
	@Column(name = "IdPreletor")
	private Integer idPreletor;
	
	@Column(name = "NumPresentes")
	private Integer numeroPresentes;

	@Column(name = "NumVisitantes")
	private Integer numeroVisitantes;
	
	@Column(name = "IndOracao")
	private String indOracao;
	
	@Column(name = "IndDificuldade")
	private String indDificuldade;
	
	@Column(name = "IndLouvor")
	private String indLouvor;
	
	@Column(name = "IndSituacao")
	private String indSituacao;
	
	@Column(name = "Observacao")
	private String observacao;
	
	public Long getIdRelatorio() {
		return idRelatorio;
	}
	public void setIdRelatorio(Long id) {
		this.idRelatorio = id;
	}
	
	public Long getIdCelula() {
		return idCelula;
	}
	public void setIdCelula(Long idCelula) {
		this.idCelula = idCelula;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public String getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	
	public Integer getIdPreletor() {
		return idPreletor;
	}
	public void setIdPreletor(Integer idPreletor) {
		this.idPreletor = idPreletor;
	}
	
	public Integer getNumeroPresentes() {
		return numeroPresentes;
	}
	public void setNumeroPresentes(Integer numeroPresentes) {
		this.numeroPresentes = numeroPresentes;
	}
	
	public Integer getNumeroVisitantes() {
		return numeroVisitantes;
	}
	public void setNumeroVisitantes(Integer numeroVisitantes) {
		this.numeroVisitantes = numeroVisitantes;
	}
	
	public String getIndLouvor() {
		return indLouvor;
	}
	public void setIndLouvor(String indLouvor) {
		this.indLouvor = indLouvor;
	}
	
	public String getIndOracao() {
		return indOracao;
	}
	public void setIndOracao(String indOracao) {
		this.indOracao = indOracao;
	}
	
	public String getIndDificuldade() {
		return indDificuldade;
	}
	public void setIndDificuldade(String indDificuldade) {
		this.indDificuldade = indDificuldade;
	}
	
	public String getIndSituacao() {
		return indSituacao;
	}
	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
}
