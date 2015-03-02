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
public class HistoricoCandidatoDAO {
    private Connection conexao;

    public HistoricoCandidatoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(HistoricoCandidato historicoCandidato){

        String sql = "INSERT INTO HistoricoCandidato "
                + "(codigoHistoricoCandidato, dataHoraAcao, valorPago, acao, codigoCandidato) "
                + "VALUES(?, ? ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
             stmt.setInt(1, historicoCandidato.getCodigoHistoricoCandidato());
             stmt.setDate(1, (Date) historicoCandidato.getDataHoraAcao());
             stmt.setDouble(1, historicoCandidato.getValorPago());
             stmt.setString(1, historicoCandidato.getAcao());
             stmt.setInt(1, historicoCandidato.getCodigoCandidato());
             
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
