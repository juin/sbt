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
public class Configuracao {
    
    private Integer periodoValidade;
    private double custoRenovacao;
    private Date dataCadastro;
    private boolean status;
    private double custoCadastro;

    public Configuracao() {
    }

    public Integer getPeriodoValidade() {
        return periodoValidade;
    }

    public void setPeriodoValidade(Integer periodoValidade) {
        this.periodoValidade = periodoValidade;
    }

    public double getCustoRenovacao() {
        return custoRenovacao;
    }

    public void setCustoRenovacao(double custoRenovacao) {
        this.custoRenovacao = custoRenovacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getCustoCadastro() {
        return custoCadastro;
    }

    public void setCustoCadastro(double custoCadastro) {
        this.custoCadastro = custoCadastro;
    }
    
}
