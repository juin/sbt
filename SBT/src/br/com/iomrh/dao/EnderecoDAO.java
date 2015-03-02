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
public class EnderecoDAO {
    private Connection conexao;

    public EnderecoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Endereco endereco){

        String sql = "INSERT INTO Endereco "
                + "(codigoEndereco, numero, complemento, pontoReferencia, codigoLogradouro, codigoEmpresa, codigoCandidato)"
                + " VALUES(? , ?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
             stmt.setInt(1, endereco.getCodigoCandidato() );
             stmt.setInt(2, endereco.getNumero() );
             stmt.setString(3, endereco.getComplemento() );
             stmt.setString(4, endereco.getPontoReferencia() );
             stmt.setInt(5, endereco.getCodigoLogradouro());
             stmt.setInt(6, endereco.getCodigoEmpresa());
             stmt.setInt(7, endereco.getCodigoCandidato() );

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
