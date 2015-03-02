/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.*;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cremildo Lima
 */
public class FormacaoDAO {
    private Connection conexao;

    public FormacaoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Formacao formacao){

        String sql = "INSERT INTO Formacao "
                + "(codigoFormacao, instituicao, curso, nivel, status, codigoCandidato) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, formacao.getCodigoFormacao());
            stmt.setString(2, formacao.getInstituicao());
            stmt.setInt(3, formacao.getCodigoCurso());
            stmt.setString(4, formacao.getNivel());
            stmt.setString(5, formacao.getStatus());
            stmt.setInt(6, formacao.getCodigoCandidato());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
