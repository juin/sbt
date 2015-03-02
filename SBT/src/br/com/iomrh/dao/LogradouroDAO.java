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
public class LogradouroDAO {
    private Connection conexao;

    public LogradouroDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Logradouro logradouro){

        String sql = "INSERT INTO Logradouro "
                + "(codigoLogradouro, cep, nome, codigoBairro) "
                + "VALUES(?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, logradouro.getCodigoLogradouro());
            stmt.setString(2, logradouro.getCep());
            stmt.setString(3, logradouro.getNome());
            stmt.setInt(4, logradouro.getCodigoBairro());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
