/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.exception;

import br.com.iomrh.beans.*;

/**
 *
 * @author Cremildo Lima
 */
public class ProfissaoException {
    
    private int codigoProfissao;
    private String nome;
    
    public int getCodigoProfissao() {
        return codigoProfissao;
    }

    public void setCodigoProfissao(int codigoProfissao) {
        this.codigoProfissao = codigoProfissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
