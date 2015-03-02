/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.*;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cremildo Lima
 */
public class ConfiguracaoDAO {
    private Connection conexao;

    public ConfiguracaoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Configuracao configuracao){

        String sql = "INSERT INTO Configuracao "
                + "(periodoValidade, custoRenovacao, status, custoCadastro) "
                + "VALUES(?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, configuracao.getPeriodoValidade());
            stmt.setDouble(2, configuracao.getCustoRenovacao());
            stmt.setBoolean(3, configuracao.isStatus());
            stmt.setDouble(4, configuracao.getCustoCadastro());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
