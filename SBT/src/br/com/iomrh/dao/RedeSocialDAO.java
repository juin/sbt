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
public class RedeSocialDAO {
    private Connection conexao;

    public RedeSocialDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(RedeSocial redeSocial){

        String sql = "INSERT INTO redeSocial "
                + "(redeSocial, codigoCandidato) "
                + "VALUES(?. ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
             stmt.setString(1, redeSocial.getRedeSocial());
             stmt.setInt(2, redeSocial.getCodigoCandidato());
             
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
