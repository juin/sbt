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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cremildo Lima
 */
public class CurriculoIdiomaDAO {
    private Connection conexao;

    public CurriculoIdiomaDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(CurriculoIdioma curriculoIdioma){

        String sql = "INSERT INTO CurriculoIdioma "
                + "(codigoCurriculoIdioma, nome, nivelFala, nivelEscrita, nivelLeitura) "
                + "VALUES(?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
             stmt.setInt(1, curriculoIdioma.getCodigoCurriculoIdioma());
             stmt.setString(2, curriculoIdioma.getNome());
             stmt.setString(3, curriculoIdioma.getNivelFala());
             stmt.setString(4, curriculoIdioma.getNivelEscrita());
             stmt.setString(5, curriculoIdioma.getNivelLeitura());
             
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<CurriculoIdioma> listar(){
        
        List<CurriculoIdioma> cursos = new ArrayList<>();
        String sql = "SELECT * FROM CurriculoIdioma ORDER BY nome";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            // executa
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                CurriculoIdioma ci = new CurriculoIdioma();
                ci.setCodigoCurriculoIdioma(resultado.getInt("codigoCurriculoIdioma"));
                ci.setNome(resultado.getString("nome"));
                ci.setNivelEscrita(resultado.getString("nivelEscrita"));
                ci.setNivelFala(resultado.getString("nivelFala"));
                ci.setNivelLeitura(resultado.getString("nivelLeitura"));
                cursos.add(ci);
            }
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return cursos;
    }
}
