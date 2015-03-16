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

public class Colaborador{

    private Integer codigoColaborador;
    private String prenome;
    private String sobrenome;
    private String login;
    private String email;
    private String senha;
    private String status;

    public Colaborador() {
    }

    public Colaborador(Integer codigoColaborador) {
        this.codigoColaborador = codigoColaborador;
    }

    public Colaborador(Integer codigoColaborador, String prenome, String sobrenome, String login, String email, String senha, String status) {
        this.codigoColaborador = codigoColaborador;
        this.prenome = prenome;
        this.sobrenome = sobrenome;
        this.login = login;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    public Integer getCodigoColaborador() {
        if(this.codigoColaborador == null)
            return 0;
        return codigoColaborador;
    }

    public void setCodigoColaborador(Integer codigoColaborador) {
        this.codigoColaborador = codigoColaborador;
    }

    public String getPrenome() {
        return prenome;
    }

    public void setPrenome(String prenome) {
        this.prenome = prenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}
