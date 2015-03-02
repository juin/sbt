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
public class CaracteristicasCandidatoDAO {
    private Connection conexao;

    public CaracteristicasCandidatoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(CaracteristicasCandidato caracteristicasCandidato){

        String sql = "INSERT INTO caracteristicasCandidato "
                + "(caracteristicasCandidato, codigoCandidato) "
                + "VALUES(?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, caracteristicasCandidato.getCaracteristicasCandidato() );
            stmt.setInt(2, caracteristicasCandidato.getCodigoCandidato());

            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
