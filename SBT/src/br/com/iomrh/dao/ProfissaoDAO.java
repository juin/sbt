/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.Candidato;
import br.com.iomrh.beans.Profissao;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    
    public List<Profissao> buscaProfissaoPorCodigo(int codigoProfissao){
        
        List<Profissao> profissoes = new ArrayList<Profissao>();
        String sql = "SELECT * FROM Profissao WHERE codigoProfissao LIKE ?";
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, codigoProfissao);
            
            
            // executa
            ResultSet resultado = stmt.executeQuery();
            
            while (resultado.next()) {
                
                Profissao profissao = new Profissao();
                
                 profissao.setCodigoProfissao(resultado.getInt("codigoProfissao"));
                 profissao.setNome(resultado.getString("nome"));
                 
                 profissoes.add(profissao);
            }
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return profissoes;
    }
    
    public List<Profissao> buscaProfissao(Profissao p){
        
        List<Profissao> profissoes = new ArrayList<Profissao>();
        String sql = "SELECT * FROM Profissao WHERE codigoProfissao LIKE ? AND nome LIKE ?";
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            if(p.getCodigoProfissao() != null)
                stmt.setInt(1, p.getCodigoProfissao());
            else
                stmt.setString(1, "%");
            
            if(p.getNome() == null)
                stmt.setString(2, "%");
            else
                stmt.setString(2, p.getNome());
            
            //executa
            ResultSet resultado = stmt.executeQuery();
            
            while (resultado.next()) {
                
                Profissao profissao = new Profissao();
                
                profissao.setCodigoProfissao(resultado.getInt("codigoProfissao"));
                profissao.setNome(resultado.getString("nome"));
                 
                profissoes.add(profissao);
            }
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return profissoes;
    }
}
