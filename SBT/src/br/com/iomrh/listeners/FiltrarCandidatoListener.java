/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.iomrh.listeners;

import br.com.iomrh.beans.ExperienciaProfissional;
import br.com.iomrh.beans.Profissao;
import br.com.iomrh.dao.ProfissaoDAO;
import static java.lang.Boolean.TRUE;
import javax.swing.JTable;

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
}


