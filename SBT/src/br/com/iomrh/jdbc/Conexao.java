/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cremildo Lima
 */
public class Conexao {
    
    public Connection getConexao() {
        try {
            return DriverManager.getConnection(
            "jdbc:mysql://localhost/sbt", "root", "nano2012");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
