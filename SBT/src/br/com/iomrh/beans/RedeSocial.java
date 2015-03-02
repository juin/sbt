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

public class RedeSocial{
    
    private String redeSocial;
    private Integer codigoCandidato;

    public RedeSocial() {
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }
    
    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }
}