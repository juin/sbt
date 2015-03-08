/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbt;

import br.com.iomrh.beans.Candidato;
import br.com.iomrh.beans.Configuracao;
import br.com.iomrh.beans.Profissao;
import br.com.iomrh.dao.CandidatoDAO;
import br.com.iomrh.dao.ConfiguracaoDAO;
import br.com.iomrh.dao.ProfissaoDAO;
import br.com.iomrh.jdbc.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cremildo Lima
 */
public class SBT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        
        //Teste2
        Connection connection = new Conexao().getConexao();
        
//        p.setCodigoProfissao(9878);
//        p.setNome("Miseravão da Bahia");
        ProfissaoDAO pd = new ProfissaoDAO();
//        pd.inserir(p);
//        p = null;
        Profissao prof = new Profissao();
        //prof.setCodigoProfissao(9878);
        prof.setNome("Miseravão da Bahia");
        
        List<Profissao> p = pd.buscaProfissao(prof);
        
        for(Profissao profissao : p){
            System.out.println("Código da profissão: " + profissao.getCodigoProfissao());
            System.out.println("Nome da profissão: " + profissao.getNome());
        }
        
        Configuracao c = new Configuracao();
        c.setCustoCadastro(40.0);
        c.setCustoRenovacao(40.0);
        c.setPeriodoValidade(12);
        c.setStatus(true);
        ConfiguracaoDAO config = new ConfiguracaoDAO();
        config.inserir(c);
        
//        Candidato can = new Candidato();
//        CandidatoDAO candidato = new CandidatoDAO();
//        can = candidato.buscaCandidatoPorCodigo(1);
//        System.out.println(can.getPrenome());
//        connection.close();

    }
    
}
