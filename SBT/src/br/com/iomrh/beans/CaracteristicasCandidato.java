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
public class CaracteristicasCandidato implements Comparable<CaracteristicasCandidato>{
    
    private Integer codigoCandidato;
    private String caracteristicasCandidato;

    public CaracteristicasCandidato() {
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public String getCaracteristicasCandidato() {
        return caracteristicasCandidato;
    }

    public void setCaracteristicasCandidato(String caracteristicasCandidato) {
        this.caracteristicasCandidato = caracteristicasCandidato;
    }

    @Override
    public int compareTo(CaracteristicasCandidato cc) {
        CaracteristicasCandidato carac = (CaracteristicasCandidato) cc;
        if(getCaracteristicasCandidato().equals(cc.getCaracteristicasCandidato()))
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return caracteristicasCandidato;
    }

    
}
