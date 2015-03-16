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
public class HistoricoCandidato{
    
    private Integer codigoHistoricoCandidato;
    private Date dataHoraAcao;
    private double valorPago;
    private String acao;
    private Integer codigoCandidato;

    public HistoricoCandidato() {
    }

    public Integer getCodigoHistoricoCandidato() {
        if(this.codigoHistoricoCandidato == null)
            return 0;
        return codigoHistoricoCandidato;
    }

    public void setCodigoHistoricoCandidato(Integer codigoHistoricoCandidato) {
        this.codigoHistoricoCandidato = codigoHistoricoCandidato;
    }

    public Date getDataHoraAcao() {
        return dataHoraAcao;
    }

    public void setDataHoraAcao(Date dataHoraAcao) {
        this.dataHoraAcao = dataHoraAcao;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    @Override
    public String toString() {
        return "bancodetalentos.HistoricoCandidato[ codigoHistoricoCandidato=" + codigoHistoricoCandidato + " ]";
    }
    
}
