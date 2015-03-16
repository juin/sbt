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

public class Formacao{

    private Integer codigoFormacao;
    private String instituicao;
    private String nivel;
    private String status;
    private Integer codigoCandidato;
    private Integer codigoCurso;

    public Formacao() {
    }

    public Integer getCodigoFormacao() {
        if(this.codigoFormacao == null)
            return 0;
        return codigoFormacao;
    }

    public void setCodigoFormacao(Integer codigoFormacao) {
        this.codigoFormacao = codigoFormacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    
    @Override
    public String toString() {
        return "bancodetalentos.Formacao[ codigoFormacao=" + codigoFormacao + " ]";
    }
    
}
