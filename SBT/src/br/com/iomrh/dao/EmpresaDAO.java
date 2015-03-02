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
public class EmpresaDAO {
    private Connection conexao;

    public EmpresaDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(EmpresaDAO empresa){

        String sql = "INSERT INTO Empresa "
                + "(codigoEmpresa, nomeFantasia, cnpj, email, razaoSocial, dataCadastro) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
