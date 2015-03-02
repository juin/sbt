/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.Bairro;
import br.com.iomrh.beans.Telefone;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cremildo Lima
 */
public class BairroDAO {
    
    private Connection conexao;
    
    public BairroDAO() {
       this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Bairro bairro){

        String sql = "INSERT INTO Bairro "
                + "(codigoBairro, nome, codigoCidade)"
                + "VALUES (?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, bairro.getCodigoBairro());
            stmt.setString(2, bairro.getNome());
            stmt.setInt(3, bairro.getCodigoCidade());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
    
}
