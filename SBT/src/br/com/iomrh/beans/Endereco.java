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
public class Endereco{

    private Integer codigoEndereco;
    private Integer numero;
    private String complemento;
    private String pontoReferencia;
    private Integer codigoCandidato;
    private Integer codigoLogradouro;
    private Integer codigoEmpresa;

    public Endereco() {
    }

    public Endereco(Integer codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public Endereco(Integer codigoEndereco, int numero) {
        this.codigoEndereco = codigoEndereco;
        this.numero = numero;
    }

    public Integer getCodigoEndereco() {
        if(this.codigoEndereco == null)
            return 0;
        return codigoEndereco;
    }

    public void setCodigoEndereco(Integer codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public int getCodigoLogradouro() {
        return codigoLogradouro;
    }

    public void setCodigoLogradouro(Integer codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    
}
