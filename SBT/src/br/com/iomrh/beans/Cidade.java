/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.beans;

import java.util.List;

/**
 *
 * @author Cremildo Lima
 */
public class Cidade{
    
    private Integer codigoCidade;
    private String nome;
    private Integer codigoEstado;
    private List<Bairro> bairroList;
    
    public Cidade() {
    }

    public Integer getCodigoCidade() {
        if(this.codigoCidade == null)
            return 0;
        return codigoCidade;
    }

    public void setCodigoCidade(Integer codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public List<Bairro> getBairroList() {
        return bairroList;
    }

    public void setBairroList(List<Bairro> bairroList) {
        this.bairroList = bairroList;
    }

    
}
