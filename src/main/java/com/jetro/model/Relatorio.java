package com.jetro.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity( name = "CelulaRel")
public class Relatorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdCelulaRel")
	private Long idRelatorio;

	@OneToOne(fetch = FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name = "IdCelula", referencedColumnName = "IdCelula")
	private Celula celula;

	@NotNull(message = "O campo de data precisa ser preenchido.")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Data")
	private Date data;

	@NotEmpty(message = "O campo de hora de início não pode ser vazio.")
	@Size(max = 4, min = 2, message = "O campo de hora de início não pode ter menos que 2 caracteres.")
	@Column(name = "HrInicio")
	private String horaInicio;

	@NotEmpty(message = "O campo de hora de fim não pode ser vazio.")
	@Size(max = 4, min = 2, message = "O campo de hora de fim não pode ter menos que 2 caracteres.")
	@Column(name = "HrFim")
	private String horaFim;

	@NotNull(message = "Precisa-se selecionar algum preletor.")
	@ManyToOne(fetch = FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name = "IdPreletor", referencedColumnName = "IdMembro")
	private Membro preletor;

	@NotNull(message = "O campo de número de presentes não pode ser vazio.")
	@DecimalMin(value = "1", message = "O número de presentes não pode ser menor que 1.")
	@Column(name = "NumPresentes")
	private Integer numeroPresentes;

	@NotNull(message = "O campo de número de visitantes não pode ser vazio.")
	@DecimalMin(value = "1", message = "O número de visitantes não pode ser menor que 1.")
	@Column(name = "NumVisitantes")
	private Integer numeroVisitantes;

	@Column(name = "IndOracao")
	private String indOracao;

	@Column(name = "IndDificuldade")
	private String indDificuldade;

	@NotEmpty(message = "O campo de tipo de louvor não pode ser vazio.")
	@Column(name = "IndLouvor")
	private String indLouvor;

	@Column(name = "IndSituacao")
	private String indSituacao;

	@Column(name = "Observacao")
	private String observacao;

	@Column(name = "Espiritual")
	private String espiritual;

	@Column(name = "Oracao")
	private String oracao;

	public Long getIdRelatorio() {
		return idRelatorio;
	}
	public void setIdRelatorio(Long id) {
		this.idRelatorio = id;
	}
	
	public Celula getCelula() {
		return celula;
	}
	public void setCelula(Celula celula) {
		this.celula = celula;
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

	public String getEspiritual() {
		return espiritual;
	}
	public void setEspiritual(String espiritual) {
		this.espiritual = espiritual;
	}

	public String getOracao() {
		return oracao;
	}
	public void setOracao(String oracao) {
		this.oracao = oracao;
	}
}
