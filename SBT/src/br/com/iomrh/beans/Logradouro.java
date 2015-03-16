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

public class Logradouro{

    private Integer codigoLogradouro;
    private String cep;
    private String nome;
    private List<Endereco> enderecoList;
    private Integer codigoBairro;

    public Logradouro() {
    }

    public Integer getCodigoLogradouro() {
        if(this.codigoLogradouro == null)
            return 0;
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

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
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
