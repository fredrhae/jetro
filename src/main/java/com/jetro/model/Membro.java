package com.jetro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Membro")
public class Membro {

	@Id
	@Column(name = "IdMembro")
	private Long idMembro;
	
	@Column(name = "IdIgreja")
	private Long idIgreja;
	
	@Column(name = "NomeMembro")
	private String nomeMembro;
	
	@Column(name = "Apelido")
	private String apelido;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "DtNascimento")
	private Date dataNascimento;
	
	@Column(name = "IdRegiao")
	private Integer idRegiao;
	
	@Column(name = "IdPais")
	private Integer idPais;
	
	@Column(name = "IdUf")
	private Integer idUf;
	
	@Column(name = "IdCidade")
	private Integer idCidade;
	
	@Column(name = "Endereco")
	private String endereco;

	@Column(name = "Bairro")
	private String bairro;
	
	@Column(name = "Fone1")
	private String fone1;
	
	@Column(name = "Fone2")
	private String fone2;
	
	@Column(name = "Email1")
	private String email1;
	
	@Column(name = "Email2")
	private String email2;
	
	@Column(name = "EstCivil")
	private String estCivil;
	
	@Column(name = "IndLideranca")
	private Integer indLideranca;
	
	@Column(name = "IndBatizado")
	private Integer indBatizado;
	
	@Column(name = "DtBatismo")
	private String dataBatismo;
	
	@Column(name = "DtConversao")
	private String dataConversao;
	
	@Column(name = "DtCadastro")
	private String dataCadastro;
	
	@Column(name = "Observacao")
	private String observacao;
	
	@Column(name = "IndUncao")
	private String indUncao;
	
	@Column(name = "IdUserCad")
	private String idUserCadastro;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "RG")
	private String rg;
	
	@Column(name = "Foto")
	private String foto;
	
	@Column(name = "Filhos")
	private Integer qtdFilhos;
	
	@Column(name = "MesDiaNiver")
	private String mesDiaAniversario;
	
	@Column(name = "Facebook")
	private String facebook;
	
	@Column(name = "MergTodos")
	private String mergTodos;
	
	@Column(name = "IndRestrito")
	private Integer indRestrito;
	
	@Column(name = "IndCura")
	private Integer indCura;
	
	@Column(name = "IndIndividual")
	private Integer indIndividual;
	
	@Column(name = "IndSib")
	private Integer indSib;
	
	@Column(name = "IndSituacao")
	private String indSituacao;
	
	@Column(name = "TamCamisa")
	private String tamCamisa;
	
	@Column(name = "IndIntegrado")
	private Integer indIntegrado;
	
	@Column(name = "IndEmailInt")
	private Integer indEmailInt;
	
	@Column(name = "IndMinEspecial")
	private Integer indMinEspecial;
	
	@Column(name = "DtCadastroInt")
	private Date dataCadastroInt;

	@Column(name = "DtBatismoReal")
	private Date dataBatismoReal;
	
	@Column(name = "DtQuerBatismo")
	private Date dataQuerBatismo;
	
	public Long getId() {
		return idMembro;
	}
	
	public void setId(Long id) {
		this.idMembro = id;
	}
	
	public Long getIdIgreja() {
		return idIgreja;
	}
	
	public void setIdIgreja(Long idIgreja) {
		this.idIgreja = idIgreja;
	}
	
	public String getNomeMembro() {
		return nomeMembro;
	}
	
	public void setNomeMembro(String nomeMembro) {
		this.nomeMembro = nomeMembro;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Integer getIdRegiao() {
		return idRegiao;
	}
	
	public void setIdRegiao(Integer idRegiao) {
		this.idRegiao = idRegiao;
	}
	
	public Integer getIdPais() {
		return idPais;
	}
	
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	
	public Integer getIdUf() {
		return idUf;
	}
	
	public void setIdUf(Integer idUf) {
		this.idUf = idUf;
	}
	
	public Integer getIdCidade() {
		return idCidade;
	}
	
	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getFone1() {
		return fone1;
	}
	
	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}
	
	public String getFone2() {
		return fone2;
	}
	
	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}
	
	public String getEmail1() {
		return email1;
	}
	
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	
	public String getEmail2() {
		return email2;
	}
	
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
	public String getEstCivil() {
		return estCivil;
	}
	
	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}
	
	public Integer getIndLideranca() {
		return indLideranca;
	}
	
	public void setIndLideranca(Integer indLideranca) {
		this.indLideranca = indLideranca;
	}
	
	public Integer getIndBatizado() {
		return indBatizado;
	}
	
	public void setIndBatizado(Integer indBatizado) {
		this.indBatizado = indBatizado;
	}
	
	public String getDataBatismo() {
		return dataBatismo;
	}
	
	public void setDataBatismo(String dataBatismo) {
		this.dataBatismo = dataBatismo;
	}
	
	public String getDataConversao() {
		return dataConversao;
	}
	
	public void setDataConversao(String dataConversao) {
		this.dataConversao = dataConversao;
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getIndUncao() {
		return indUncao;
	}
	
	public void setIndUncao(String indUncao) {
		this.indUncao = indUncao;
	}
	
	public String getIdUserCadastro() {
		return idUserCadastro;
	}
	
	public void setIdUserCadastro(String idUserCadastro) {
		this.idUserCadastro = idUserCadastro;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public Integer getQtdFilhos() {
		return qtdFilhos;
	}
	
	public void setQtdFilhos(Integer qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}
	
	public String getMesDiaAniversario() {
		return mesDiaAniversario;
	}
	
	public void setMesDiaAniversario(String mesDiaAniversario) {
		this.mesDiaAniversario = mesDiaAniversario;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	public String getMergTodos() {
		return mergTodos;
	}
	
	public void setMergTodos(String mergTodos) {
		this.mergTodos = mergTodos;
	}
	
	public Integer getIndRestrito() {
		return indRestrito;
	}
	
	public void setIndRestrito(Integer indRestrito) {
		this.indRestrito = indRestrito;
	}
	
	public Integer getIndCura() {
		return indCura;
	}
	
	public void setIndCura(Integer indCura) {
		this.indCura = indCura;
	}
	
	public Integer getIndIndividual() {
		return indIndividual;
	}
	
	public void setIndIndividual(Integer indIndividual) {
		this.indIndividual = indIndividual;
	}
	
	public Integer getIndSib() {
		return indSib;
	}
	
	public void setIndSib(Integer indSib) {
		this.indSib = indSib;
	}
	
	public String getIndSituacao() {
		return indSituacao;
	}
	
	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}
	
	public String getTamCamisa() {
		return tamCamisa;
	}
	
	public void setTamCamisa(String tamCamisa) {
		this.tamCamisa = tamCamisa;
	}
	
	public Integer getIndIntegrado() {
		return indIntegrado;
	}
	
	public void setIndIntegrado(Integer indIntegrado) {
		this.indIntegrado = indIntegrado;
	}
	
	public Integer getIndEmailInt() {
		return indEmailInt;
	}
	
	public void setIndEmailInt(Integer indEmailInt) {
		this.indEmailInt = indEmailInt;
	}
	
	public Integer getIndMinEspecial() {
		return indMinEspecial;
	}
	
	public void setIndMinEspecial(Integer indMinEspecial) {
		this.indMinEspecial = indMinEspecial;
	}
	
	public Date getDataCadastroInt() {
		return dataCadastroInt;
	}
	
	public void setDataCadastroInt(Date dataCadastroInt) {
		this.dataCadastroInt = dataCadastroInt;
	}
	
	public Date getDataBatismoReal() {
		return dataBatismoReal;
	}
	
	public void setDataBatismoReal(Date dataBatismoReal) {
		this.dataBatismoReal = dataBatismoReal;
	}
	
	public Date getDataQuerBatismo() {
		return dataQuerBatismo;
	}
	
	public void setDataQuerBatismo(Date dataQuerBatismo) {
		this.dataQuerBatismo = dataQuerBatismo;
	}	
 }
