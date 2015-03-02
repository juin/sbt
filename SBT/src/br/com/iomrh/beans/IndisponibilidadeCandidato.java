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

public class IndisponibilidadeCandidato {

    private Integer codigoIndisponibilidadeCandidato;
    private String dia;
    private String turno;
    private String obs;
    private Integer codigoCandidato;

    public IndisponibilidadeCandidato() {
    }

    public IndisponibilidadeCandidato(Integer codigoIndisponibilidadeCandidato) {
        this.codigoIndisponibilidadeCandidato = codigoIndisponibilidadeCandidato;
    }

    public IndisponibilidadeCandidato(Integer codigoIndisponibilidadeCandidato, String dia, String turno) {
        this.codigoIndisponibilidadeCandidato = codigoIndisponibilidadeCandidato;
        this.dia = dia;
        this.turno = turno;
    }

    public Integer getCodigoIndisponibilidadeCandidato() {
        return codigoIndisponibilidadeCandidato;
    }

    public void setCodigoIndisponibilidadeCandidato(Integer codigoIndisponibilidadeCandidato) {
        this.codigoIndisponibilidadeCandidato = codigoIndisponibilidadeCandidato;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    @Override
    public String toString() {
        return "bancodetalentos.IndisponibilidadeCandidato[ codigoIndisponibilidadeCandidato=" + codigoIndisponibilidadeCandidato + " ]";
    }
    
}
