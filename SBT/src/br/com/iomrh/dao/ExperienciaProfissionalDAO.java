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
public class ExperienciaProfissionalDAO {
    private Connection conexao;

    public ExperienciaProfissionalDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(ExperienciaProfissional experienciaProfissional){

        String sql = "INSERT INTO ExperienciaProfissional "
                + "(codigoExperienciaProfissional, descricaoFuncao, duracao, empresa, dataAdmissao, dataDemissao, codigoCandidato, codigoProfissao) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, experienciaProfissional.getCodigoExperienciaProfissional());
            stmt.setString(2, experienciaProfissional.getDescricaoFuncao());
            stmt.setInt(3, experienciaProfissional.getDuracao());
            stmt.setString(4, experienciaProfissional.getEmpresa());
            stmt.setDate(5, (Date) experienciaProfissional.getDataAdmissao());
            stmt.setDate(6, (Date) experienciaProfissional.getDataDemissao());
            stmt.setInt(7, experienciaProfissional.getCodigoCandidato());
            stmt.setInt(8, experienciaProfissional.getCodigoProfissao());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
