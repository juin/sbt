/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Cremildo Lima
 */

public class Candidato{

    private Integer codigoCandidato;
    private String prenome;
    private String sobrenome;
    private String cnhCategoria;
    private String sexo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Short quantidadeFilhos;
    private String estadoCivil;
    private String email;
    private String disponibilidadeViajar;
    private String tipoNecessidadeEspecial;
    private String portadorNecessidadesEspeciais;
    private double pretensaoSalarial;
    private String veiculo;
    private String primeiroEmprego;
    private String gerencia;
    private int codProfissao;

    public Candidato() {
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public String getPrenome() {
        return prenome;
    }

    public void setPrenome(String prenome) {
        this.prenome = prenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCnhCategoria() {
        return cnhCategoria;
    }

    public void setCnhCategoria(String cnhCategoria) {
        this.cnhCategoria = cnhCategoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Short getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(Short quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisponibilidadeViajar() {
        return disponibilidadeViajar;
    }

    public void setDisponibilidadeViajar(String disponibilidadeViajar) {
        this.disponibilidadeViajar = disponibilidadeViajar;
    }

    public String getTipoNecessidadeEspecial() {
        return tipoNecessidadeEspecial;
    }

    public void setTipoNecessidadeEspecial(String tipoNecessidadeEspecial) {
        this.tipoNecessidadeEspecial = tipoNecessidadeEspecial;
    }

    public String getPortadorNecessidadesEspeciais() {
        return portadorNecessidadesEspeciais;
    }

    public void setPortadorNecessidadesEspeciais(String portadorNecessidadesEspeciais) {
        this.portadorNecessidadesEspeciais = portadorNecessidadesEspeciais;
    }

    public double getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(double pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPrimeiroEmprego() {
        return primeiroEmprego;
    }

    public void setPrimeiroEmprego(String primeiroEmprego) {
        this.primeiroEmprego = primeiroEmprego;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public int getCodProfissao() {
        return codProfissao;
    }

    public void setCodProfissao(int codProfissao) {
        this.codProfissao = codProfissao;
    }
    
    
}
