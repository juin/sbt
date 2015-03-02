/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.Profissao;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cremildo Lima
 */
public class ProfissaoDAO {
    
    private Connection conexao;

    public ProfissaoDAO() {
        this.conexao = new Conexao().getConexao();
    }
 
    public void inserir(Profissao profissao){

        String sql = "INSERT INTO Profissao " +
                "(codigoProfissao,nome)" +
                " VALUES (?,?)";
        try {

            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1,profissao.getCodigoProfissao());
            stmt.setString(2,profissao.getNome());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
