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
public class CursoDAO {
    private Connection conexao;

    public CursoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Curso curso){

        String sql = "INSERT INTO Curso "
                + "(codigoCurso, nomeCurso) "
                + "VALUES(?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, curso.getCodigoCurso());
            stmt.setString(2, curso.getNomeCurso());
   
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Curso> listarCursos(){
        
        List<Curso> cursos = new ArrayList<Curso>();
        String sql = "SELECT * FROM Curso";
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //executa
            ResultSet resultado = stmt.executeQuery();
            
            while (resultado.next()) {
                
                Curso curso = new Curso();
                
                curso.setCodigoCurso(resultado.getInt("codigoCurso"));
                curso.setNomeCurso(resultado.getString("nomeCurso"));
                 
                cursos.add(curso);
            }
            
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return cursos;
    }
    
    
}
