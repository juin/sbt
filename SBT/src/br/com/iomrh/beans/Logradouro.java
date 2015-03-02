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

public class Logradouro{

    private Integer codigoLogradouro;
    private String cep;
    private String nome;
    private Integer codigoBairro;

    public Logradouro() {
    }

    public Integer getCodigoLogradouro() {
        return codigoLogradouro;
    }

    public void setCodigoLogradouro(Integer codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoBairro() {
        return codigoBairro;
    }

    public void setCodigoBairro(Integer codigoBairro) {
        this.codigoBairro = codigoBairro;
    }

    @Override
    public String toString() {
        return "bancodetalentos.Logradouro[ codigoLogradouro=" + codigoLogradouro + " ]";
    }
    
}
