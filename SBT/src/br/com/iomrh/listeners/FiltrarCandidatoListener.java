/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.iomrh.listeners;

import br.com.iomrh.beans.Candidato;
import br.com.iomrh.beans.CurriculoIdioma;
import br.com.iomrh.beans.CurriculoInformatica;
import br.com.iomrh.beans.Curso;
import br.com.iomrh.beans.ExperienciaProfissional;
import br.com.iomrh.beans.Formacao;
import br.com.iomrh.beans.Profissao;
import br.com.iomrh.beans.Telefone;
import br.com.iomrh.dao.CurriculoIdiomaDAO;
import br.com.iomrh.dao.CurriculoInformaticaDAO;
import br.com.iomrh.dao.ProfissaoDAO;
import br.com.iomrh.dao.TelefoneDAO;
import static java.lang.Boolean.TRUE;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soareselu
 */
public class FiltrarCandidatoListener {
    
    public void preencherTabelaDisponibilidade(boolean value, int linhaInicio, int linhaFim, int colunaInicio, int colunaFim, JTable tabela){
        for(int i=linhaInicio; i<=linhaFim; i++){
            for(int j=colunaInicio; j<=colunaFim; j++){
                tabela.setValueAt(value, i, j);
            }
        }
    }
    
    public void inserirTabelaExperienciaProfissional(ExperienciaProfissional expTemp, JTable tabela){
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tabela.getModel();
        ProfissaoDAO pd1 = new ProfissaoDAO();
        Profissao temp = pd1.buscaProfissaoPorCodigo(expTemp.getCodigoProfissao());
        dtm.addRow(new Object[]{temp, expTemp.getDuracao(), expTemp.getGerencia()});
    }
    
    public void inserirTabelaFormacao(Formacao formacao,Curso curso, JTable tabela){
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        boolean existe = false;
        for(int i=0;i<dtm.getRowCount();i++){
            if((dtm.getValueAt(i, 0).equals(curso)) && (dtm.getValueAt(i, 1).equals(formacao.getNivel())) 
                    && (dtm.getValueAt(i, 2).equals(formacao.getStatus())))
                existe = true;
        }
        if(existe==false)
            dtm.addRow(new Object[]{curso, formacao.getNivel(), formacao.getStatus()});
    }
    public void popularTabelaInformatica(JTable tabela){
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        CurriculoInformaticaDAO tempDAO = new CurriculoInformaticaDAO();
        for(CurriculoInformatica ci : tempDAO.listar()){
            dtm.addRow(new Object[]{ci.getCodigoCurriculoInformatica(),ci.getHabilidade(),ci.getNivelHabilidade()});
        }
    }
    
    public void popularTabelaIdioma(JTable tabela){
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        CurriculoIdiomaDAO tempDAO = new CurriculoIdiomaDAO();
        for(CurriculoIdioma cid : tempDAO.listar()){
            dtm.addRow(new Object[]{cid.getCodigoCurriculoIdioma(),cid.getNome(),cid.getNivelFala(),cid.getNivelEscrita(),cid.getNivelLeitura()});
        }
    }
        
    public void listarCandidatos(JTable tabela, List<Candidato> candidatos){
        
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        //Limpa Jtable antes de inserir novas linhas
        dtm.getDataVector().removeAllElements();
        
        for(Candidato c : candidatos){
                Telefone tel = new Telefone();
                TelefoneDAO telDAO = new TelefoneDAO();
                tel = telDAO.buscaTelefonePorCodigoCandidato(c.getCodigoCandidato());
                dtm.addRow(new Object[]{c.getCodigoCandidato(), c.getCpf(), c.getPrenome()+" "+c.getSobrenome(), c.getEmail(), tel.getTelefone(),false});
        }
        
    }
    
    
}


