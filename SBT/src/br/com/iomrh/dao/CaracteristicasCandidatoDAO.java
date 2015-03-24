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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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

    public List<CaracteristicasCandidato> listarCaracteristicas() {
        
        List<CaracteristicasCandidato> caracteristicas = new ArrayList<>();
        int cont = 0;
        String sql = "SELECT DISTINCT(caracteristicasCandidato) FROM CaracteristicasCandidato ORDER BY caracteristicasCandidato";
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //executa
            ResultSet resultado = stmt.executeQuery();
            
            while (resultado.next()) {
                
                CaracteristicasCandidato carac = new CaracteristicasCandidato();
                
                carac.setCaracteristicasCandidato(resultado.getString("caracteristicasCandidato"));
                caracteristicas.add(carac);
            }
            
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }      
        return caracteristicas;
    }
    
    
}
