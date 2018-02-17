package com.jetro.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity( name = "CelulaRel")
public class Relatorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdCelulaRel")
	private Long idRelatorio;

	@Column(name = "IdCelula")
	private Long idCelula;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Data")
	private Date data;
	
	@Column(name = "HrInicio")
	private String horaInicio;
	
	@Column(name = "HrFim")
	private String horaFim;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IdPreletor", referencedColumnName = "IdMembro")
	private Membro preletor;
	
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

	@Column(name = "Oracao")
	private String oracao;

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
	
	public Membro getPreletor() {
		return preletor;
	}
	public void setPreletor(Membro preletor) {
		this.preletor = preletor;
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

	public String getOracao() {
		return oracao;
	}
	public void setOracao(String oracao) {
		this.observacao = oracao;
	}
}
