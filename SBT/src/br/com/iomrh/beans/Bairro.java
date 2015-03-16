package br.com.iomrh.beans;

import java.util.List;

/**
 *
 * @author Cremildo Lima
 */
public class Bairro {
    
    private Integer codigoCidade;
    private Integer codigoBairro;
    private String nome;
    private List<Logradouro> logradouroList;

    public Bairro() {
    }

    public Integer getCodigoCidade() {
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

    public Integer getCodigoBairro() {
        if(this.codigoBairro == null)
            return 0;
        return codigoBairro;
    }

    public void setCodigoBairro(Integer codigoBairro) {
        this.codigoBairro = codigoBairro;
    }
    
    public List<Logradouro> getLogradouroList() {
        return logradouroList;
    }

    public void setLogradouros(List<Logradouro> logradouroList) {
        this.logradouroList = logradouroList;
    }
    
}
