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
public class CandidatoCurriculoIdiomaDAO {
    private Connection conexao;

    public CandidatoCurriculoIdiomaDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(CandidatoCurriculoIdioma candidatoCurriculoIdioma){

        String sql = "INSERT INTO Candidato_CurriculoIdioma "
                + "(codigoCandidato, codigoCurriculoIdioma) "
                + "VALUES(?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, candidatoCurriculoIdioma.getCodigoCandidato());
            stmt.setInt(2, candidatoCurriculoIdioma.getCodigoCurriculoIdioma());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
