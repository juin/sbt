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
public class CidadeDAO {
    private Connection conexao;

    public CidadeDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Cidade cidade){

        String sql = "INSERT INTO Cidade "
                + "(codigoCidade, nome, codigoEstado) "
                + "VALUES(?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1,cidade.getCodigoCidade() );
            stmt.setString(2, cidade.getNome());
            stmt.setInt(3, cidade.getCodigoEstado());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
