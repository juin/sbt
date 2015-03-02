/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.beans;

/**
 *
 * @author Cremildo Lima
 */
public class CurriculoInformatica{

    private Integer codigoCurriculoInformatica;
    private String habilidade;
    private String nivelHabilidade;

    public CurriculoInformatica() {
    }

    public CurriculoInformatica(Integer codigoCurriculoInformatica) {
        this.codigoCurriculoInformatica = codigoCurriculoInformatica;
    }

    public CurriculoInformatica(Integer codigoCurriculoInformatica, String habilidade, String nivelHabilidade) {
        this.codigoCurriculoInformatica = codigoCurriculoInformatica;
        this.habilidade = habilidade;
        this.nivelHabilidade = nivelHabilidade;
    }

    public Integer getCodigoCurriculoInformatica() {
        return codigoCurriculoInformatica;
    }

    public void setCodigoCurriculoInformatica(Integer codigoCurriculoInformatica) {
        this.codigoCurriculoInformatica = codigoCurriculoInformatica;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(String nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }

    @Override
    public String toString() {
        return "bancodetalentos.CurriculoInformatica[ codigoCurriculoInformatica=" + codigoCurriculoInformatica + " ]";
    }
    
}
