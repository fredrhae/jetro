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
	
	@Column(name = "IndLouvor")
	private String louvor;
	
	@Column(name = "Observacao")
	private String observacao;
	
	public Long getId() {
		return idRelatorio;
	}
	public void setId(Long id) {
		this.idRelatorio = id;
	}
	
	public Date getDataVencimento() {
		return data;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.data = dataVencimento;
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
	
	public String getLouvor() {
		return louvor;
	}
	public void setLouvor(String louvor) {
		this.louvor = louvor;
	}
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
}
