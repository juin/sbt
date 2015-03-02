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
public class ColaboradorDAO {
    private Connection conexao;

    public ColaboradorDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Colaborador colaborador){

        String sql = "INSERT INTO Colaborador "
                + "(codigoColaborador, prenome, sobrenome, login, email, senha, status) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, colaborador.getCodigoColaborador());
            stmt.setString(2, colaborador.getPrenome());
            stmt.setString(3, colaborador.getSobrenome());
            stmt.setString(4, colaborador.getLogin());
            stmt.setString(5, colaborador.getEmail());
            stmt.setString(6, colaborador.getSenha());
            stmt.setString(6, colaborador.getStatus());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
