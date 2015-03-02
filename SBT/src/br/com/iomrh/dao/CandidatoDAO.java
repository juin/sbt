/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.Candidato;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cremildo Lima
 */
public class CandidatoDAO {
    private Connection conexao;

    public CandidatoDAO() {
        this.conexao = new Conexao().getConexao();
    }
    
    public void inserir(Candidato candidato){

        String sql = "INSERT INTO Candidato "
                + "(codigoCandidato, prenome, sobrenome, cnhCategoria, sexo, cpf, rg, dataNascimento,"
                + " quantidadeFilhos, estadoCivil, email, disponibilidadeViajar, TipoNecessidadeEspecial,"
                + " portadorNecessidadesEspeciais, pretensaoSalarial, veiculo, primeiroEmprego, gerencia, "
                + "codigoProfissao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, candidato.getCodigoCandidato());
            stmt.setString(2, candidato.getPrenome());
            stmt.setString(3, candidato.getSobrenome());
            stmt.setString(4, candidato.getCnhCategoria());
            stmt.setString(6, candidato.getSexo());
            stmt.setString(7, candidato.getCpf());
            stmt.setString(8, candidato.getRg());
            stmt.setDate(9, (Date) candidato.getDataNascimento());
            stmt.setInt(10, candidato.getQuantidadeFilhos());
            stmt.setString(11, candidato.getEstadoCivil());
            stmt.setString(12, candidato.getEmail());
            stmt.setString(13, candidato.getDisponibilidadeViajar());
            stmt.setString(14, candidato.getTipoNecessidadeEspecial());
            stmt.setString(15, candidato.getPortadorNecessidadesEspeciais());
            stmt.setDouble(16, candidato.getPretensaoSalarial());
            stmt.setString(17, candidato.getVeiculo());
            stmt.setString(18, candidato.getPrimeiroEmprego());
            stmt.setString(19, candidato.getGerencia());
            stmt.setInt(20, candidato.getCodProfissao());
            
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
