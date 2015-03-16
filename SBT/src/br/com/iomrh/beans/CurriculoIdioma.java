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
public class CurriculoIdioma{

    private Integer codigoCurriculoIdioma;
    private String nome;
    private String nivelFala;
    private String nivelEscrita;
    private String nivelLeitura;

    public CurriculoIdioma() {
    }

    public Integer getCodigoCurriculoIdioma() {
        if(this.codigoCurriculoIdioma == null)
            return 0;
        return codigoCurriculoIdioma;
    }

    public void setCodigoCurriculoIdioma(Integer codigoCurriculoIdioma) {
        this.codigoCurriculoIdioma = codigoCurriculoIdioma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelFala() {
        return nivelFala;
    }

    public void setNivelFala(String nivelFala) {
        this.nivelFala = nivelFala;
    }

    public String getNivelEscrita() {
        return nivelEscrita;
    }

    public void setNivelEscrita(String nivelEscrita) {
        this.nivelEscrita = nivelEscrita;
    }
    
    public String getNivelLeitura() {
        return nivelEscrita;
    }

    public void setNivelLeitura(String nivelLeitura) {
        this.nivelLeitura = nivelLeitura;
    }
  
}
