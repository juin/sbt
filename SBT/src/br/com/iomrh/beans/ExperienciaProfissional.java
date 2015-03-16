/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.beans;

import java.util.Date;

/**
 *
 * @author Cremildo Lima
 */
public class ExperienciaProfissional{

    private Integer codigoExperienciaProfissional;
    private String descricaoFuncao;
    private int duracao;
    private String empresa;
    private Date dataAdmissao;
    private Date dataDemissao;
    private String gerencia;
    private Integer codigoProfissao;
    private Integer codigoCandidato;

    public ExperienciaProfissional() {
    }

    public Integer getCodigoExperienciaProfissional() {
        if(this.codigoExperienciaProfissional == null)
            return 0;
        return codigoExperienciaProfissional;
    }

    public void setCodigoExperienciaProfissional(Integer codigoExperienciaProfissional) {
        this.codigoExperienciaProfissional = codigoExperienciaProfissional;
    }

    public String getDescricaoFuncao() {
        return descricaoFuncao;
    }

    public void setDescricaoFuncao(String descricaoFuncao) {
        this.descricaoFuncao = descricaoFuncao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
    
    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public Integer getCodigoProfissao() {
        return codigoProfissao;
    }

    public void setCodigoProfissao(Integer codigoProfissao) {
        this.codigoProfissao = codigoProfissao;
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    @Override
    public String toString() {
        return "bancodetalentos.ExperienciaProfissional[ codigoExperienciaProfissional=" + codigoExperienciaProfissional + " ]";
    }
    
}
