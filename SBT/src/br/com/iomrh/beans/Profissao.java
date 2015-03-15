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

public class Profissao{

    private Integer codigoProfissao;
    private String nome;
    private List<Candidato> candidatoList;
    private List<ExperienciaProfissional> experienciaProfissionalList;
    
    public Profissao() {
    }

    public Integer getCodigoProfissao() {
        return codigoProfissao;
    }

    public void setCodigoProfissao(Integer codigoProfissao) {
        this.codigoProfissao = codigoProfissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Candidato> getCandidatoList() {
        return candidatoList;
    }

    public void setCandidatoList(List<Candidato> candidatoList) {
        this.candidatoList = candidatoList;
    }

    public List<ExperienciaProfissional> getExperienciaProfissionalList() {
        return experienciaProfissionalList;
    }

    public void setExperienciaProfissionalList(List<ExperienciaProfissional> experienciaProfissionalList) {
        this.experienciaProfissionalList = experienciaProfissionalList;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
