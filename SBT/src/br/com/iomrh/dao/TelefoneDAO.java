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

/**
 *
 * @author Cremildo Lima
 */
public class TelefoneDAO {
    private Connection conexao;

    public TelefoneDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Telefone telefone){

        String sql = "INSERT INTO telefone "
                + "(codigoTelefone, telefone, tipoTelefone, codigoCandidato, codigoEmpresa) "
                + "VALUES(?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
             stmt.setInt(1, telefone.getCodigoTelefone());
             stmt.setString(2, telefone.getTelefone());
             stmt.setString(3, telefone.getTipoTelefone());
             stmt.setInt(4, telefone.getCodigoCandidato());
             stmt.setInt(5, telefone.getCodigoEmpresa());
             
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Telefone buscaTelefonePorCodigoCandidato(int codigoCandidato){
        
        Telefone tel = new Telefone();
        String sql = "SELECT * FROM Telefone WHERE codigoCandidato = ? LIMIT 1";
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, codigoCandidato);
            
            //executa
            ResultSet resultado = stmt.executeQuery();
            
            while (resultado.next()) {
                tel.setTelefone(resultado.getString("telefone"));
            }            
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tel;
        
    }
    
    
}
