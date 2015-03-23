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
import java.util.Collection;
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
            stmt.setDouble(16, candidato.getPretensaoSalarialMin());
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
    
    public List<Candidato> buscaCandidatoPorExperienciasProfissionais(Candidato candidato){
        
        List<Candidato> candidatos = new ArrayList<Candidato>();
        String sql = "SELECT c.codigoCandidato as codCandidato,c.cpf as cpfCandidato, c.prenome as prenomeCandidato,"
                + "c.sobrenome as sobrenomeCandidato,c.email as emailCandidato,exp.gerencia "
                + "FROM Candidato c JOIN ExperienciaProfissional exp ON c.codigoCandidato = exp.codigoCandidato "
                + "WHERE c.codigoCandidato LIKE ? "
                + "AND exp.codigoProfissao LIKE ? AND exp.gerencia LIKE ? "
                + "GROUP BY (c.codigoCandidato) HAVING (SUM(exp.duracao) > ?)";
        
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            if(candidato.getCodigoCandidato() != null)
                stmt.setInt(1, candidato.getCodigoCandidato());
            else
                stmt.setString(1, "%");

            if(!candidato.getExperienciaProfissionalList().isEmpty())
                    stmt.setInt(2, candidato.getExperienciaProfissionalList().get(0).getCodigoProfissao());
            else
                stmt.setString(2, "%");
            
            if(candidato.getGerencia().equals("Sim"))
                stmt.setString(3, candidato.getGerencia());
            else
                stmt.setString(3, "%");
            
            if(!candidato.getExperienciaProfissionalList().isEmpty())
                    stmt.setInt(4, candidato.getExperienciaProfissionalList().get(0).getDuracao());
            else
                stmt.setString(4, "%");
            
            // executa
            System.out.println(stmt);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Candidato can = new Candidato();
                can.setCodigoCandidato(resultado.getInt("codCandidato"));
                can.setCpf(resultado.getString("cpfCandidato"));
                can.setPrenome(resultado.getString("prenomeCandidato"));
                can.setSobrenome(resultado.getString("sobrenomeCandidato"));
                can.setEmail(resultado.getString("emailCandidato"));
                candidatos.add(can);
            }
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return candidatos;
    }
    
    public List<Candidato> buscaCandidatoPorDadosPessoais(Candidato candidato){
        
        List<Candidato> candidatos = new ArrayList<Candidato>();
        String sql = "SELECT * FROM Candidato WHERE codigoCandidato LIKE ? AND prenome LIKE ? AND sobrenome LIKE ? AND cpf LIKE ? "
                + "AND rg LIKE ? AND dataNascimento LIKE ? AND quantidadeFilhos LIKE ? AND sexo LIKE ? AND estadoCivil LIKE ? "
                + "AND cnhCategoria LIKE ? AND veiculo LIKE ? AND portadorNecessidadeEspecial LIKE ? AND disponibilidadeViajar LIKE ? "
                + "AND primeiroEmprego LIKE ? AND gerencia LIKE ? AND codigoProfissao LIKE ? "
                + "AND pretensaoSalarial BETWEEN ? AND ?;";    
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            if(candidato.getCodigoCandidato() != null)
                stmt.setInt(1, candidato.getCodigoCandidato());
            else
                stmt.setString(1, "%");
            
            if(!candidato.getPrenome().isEmpty())
                stmt.setString(2, "%"+candidato.getPrenome()+"%");
            else
                stmt.setString(2, "%");
            
            if(!candidato.getSobrenome().isEmpty())
                stmt.setString(3, "%"+candidato.getSobrenome()+"%");
            else
                stmt.setString(3, "%");
            
            if(!candidato.getCpf().isEmpty())
                stmt.setString(4, candidato.getCpf());
            else
                stmt.setString(4, "%");
            
            if(!candidato.getRg().isEmpty())
                stmt.setString(5, candidato.getRg());
            else
                stmt.setString(5, "%");
            
            if(candidato.getDataNascimento()!= null){
                java.sql.Date sDate = new java.sql.Date(candidato.getDataNascimento().getTime());
                stmt.setDate(6, sDate);
            } else
                stmt.setString(6, "%");
            
            if(candidato.getQuantidadeFilhos()!= null)
                stmt.setInt(7, candidato.getQuantidadeFilhos());
            else
                stmt.setString(7, "%");
            
            if(candidato.getSexo()!=null)
                stmt.setString(8, candidato.getSexo());
            else
                stmt.setString(8, "%");
            
            if(candidato.getEstadoCivil()!=null)
                stmt.setString(9, candidato.getEstadoCivil());
            else
                stmt.setString(9, "%");
            
            if(candidato.getCnhCategoria()!=null)
                stmt.setString(10, candidato.getCnhCategoria());
            else
                stmt.setString(10, "%");
            
            if(candidato.getVeiculo()!=null)
                stmt.setString(11, candidato.getVeiculo());
            else
                stmt.setString(11, "%");
            
            if(candidato.getPortadorNecessidadesEspeciais()!=null)
                stmt.setString(12, candidato.getPortadorNecessidadesEspeciais());
            else
                stmt.setString(12, "%");
            
            if(candidato.getDisponibilidadeViajar()!=null)
                stmt.setString(13, candidato.getDisponibilidadeViajar());
            else
                stmt.setString(13, "%");
            
            if(candidato.getPrimeiroEmprego()!=null)
                stmt.setString(14, candidato.getPrimeiroEmprego());
            else
                stmt.setString(14, "%");
            
            if(candidato.getGerencia()!=null)
                stmt.setString(15, candidato.getGerencia());
            else
                stmt.setString(15, "%");
           
            if(candidato.getCodProfissao() != null)
                stmt.setInt(16, candidato.getCodProfissao());
            else
                stmt.setString(16, "%");
                        
            if(candidato.getPretensaoSalarialMin()!=0)
                stmt.setDouble(17, candidato.getPretensaoSalarialMin());
            else
                stmt.setInt(17, 0);
            
            if(candidato.getPretensaoSalarialMax()!=0)
                stmt.setDouble(18, candidato.getPretensaoSalarialMax());
            else
                stmt.setInt(18, 99999);
            

                       
            // executa
            System.out.println(stmt);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Candidato can = new Candidato();
                can.setCodigoCandidato(resultado.getInt("codigoCandidato"));
                can.setCpf(resultado.getString("cpf"));
                can.setPrenome(resultado.getString("prenome"));
                can.setSobrenome(resultado.getString("sobrenome"));
                can.setEmail(resultado.getString("email"));
                candidatos.add(can);
            }
            stmt.close();
            resultado.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return candidatos;
    }

    public List<Candidato> buscaCandidatoPorIndisponibilidade(Candidato candidato) {
        
        List<Candidato> candidatos = new ArrayList<Candidato>();
        String sql = "SELECT c.codigoCandidato as codCandidato,c.cpf as cpfCandidato, c.prenome as prenomeCandidato,"
                + "c.sobrenome as sobrenomeCandidato,c.email as emailCandidato"
                + " FROM Candidato c JOIN IndisponibilidadeCandidato ind ON c.codigoCandidato = ind.codigoCandidato "
                + "WHERE ind.dia LIKE ? AND ind.turno LIKE ?"
                + " GROUP BY (c.codigoCandidato)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            if(!candidato.getIndisponibilidadeCandidatoList().isEmpty())
                    stmt.setString(1, candidato.getIndisponibilidadeCandidatoList().get(0).getDia());
            else
                stmt.setString(1, "%");
            
            if(!candidato.getIndisponibilidadeCandidatoList().isEmpty())
                    stmt.setString(2, candidato.getIndisponibilidadeCandidatoList().get(0).getTurno());
            else
                stmt.setString(2, "%");
            
            // executa
            System.out.println(stmt);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Candidato can = new Candidato();
                can.setCodigoCandidato(resultado.getInt("codCandidato"));
                can.setCpf(resultado.getString("cpfCandidato"));
                can.setPrenome(resultado.getString("prenomeCandidato"));
                can.setSobrenome(resultado.getString("sobrenomeCandidato"));
                can.setEmail(resultado.getString("emailCandidato"));
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
