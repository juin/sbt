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
public class IndisponibilidadeCandidatoDAO {
    private Connection conexao;

    public IndisponibilidadeCandidatoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(IndisponibilidadeCandidato indisponibilidadeCandidato){

        String sql = "INSERT INTO IndisponibilidadeCandidato "
                + "(codigoIndisponibilidadeCandidato, dia, turno, obs, codigoCandidato) "
                + "VALUES(?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1,indisponibilidadeCandidato.getCodigoCandidato() );
            stmt.setString(2, indisponibilidadeCandidato.getDia());
            stmt.setString(3, indisponibilidadeCandidato.getTurno() );
            stmt.setString(4, indisponibilidadeCandidato.getObs());
            stmt.setInt(5, indisponibilidadeCandidato.getCodigoCandidato());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
