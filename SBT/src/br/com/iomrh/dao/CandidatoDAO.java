/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.dao;

import br.com.iomrh.beans.Candidato;
import br.com.iomrh.exception.CandidadoException;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    
    public Candidato buscaCandidatoPorCodigo(int codigoCandidato){
        
        Candidato candidato = new Candidato();
        String sql = "SELECT * FROM Candidato WHERE codigoCandidato = ?";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, codigoCandidato);
            
            // executa
            ResultSet resultado = stmt.executeQuery();
            stmt.close();
            while (resultado.next()) {
                 candidato.setCodigoCandidato(resultado.getInt("codigoCandidato"));
                 candidato.setPrenome(resultado.getString("prenome"));
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return candidato;
    }
    
    public List<Candidato> buscaCandidato(Candidato candidato){
        
        List<Candidato> candidatos = new ArrayList<Candidato>();
        String sql = "SELECT * FROM Candidato WHERE codigoCandidato LIKE ? AND "
                + "codigoProfissao LIKE ?";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            if(candidato.getCodigoCandidato() != null)
                stmt.setInt(1, candidato.getCodigoCandidato());
            else
                stmt.setString(1, "%");
            
            if(candidato.getCodProfissao() != null)
                stmt.setInt(2, candidato.getCodProfissao());
            else
                stmt.setString(2, "%");
            
            // executa
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Candidato can = new Candidato();
                can.setCodigoCandidato(resultado.getInt("codigoCandidato"));
                can.setPrenome(resultado.getString("prenome"));
                can.setSobrenome(resultado.getString("sobrenome"));
                can.setCodProfissao(resultado.getInt("codigoProfissao"));
                candidatos.add(can);
            }
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return candidatos;
    }
    
    
}
