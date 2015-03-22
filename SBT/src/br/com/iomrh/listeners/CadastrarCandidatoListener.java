/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.listeners;

import br.com.iomrh.dao.ProfissaoDAO;
import br.com.iomrh.helpers.MyComboBoxEditor;
import br.com.iomrh.helpers.MyComboBoxRenderer;
import java.awt.Component;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @author joabe_000
 */
public class CadastrarCandidatoListener {
    
    //Inicia os elementos da interface Cadastrar candidato
    public void init(JPanel[] jPanels){
        ocultarTodasMensagens(jPanels);
    }
    
    /** Oculta todoas as mensagens de validação da tela cadastrar candidato
     * @param jPanels **/
    public void ocultarTodasMensagens(JPanel[] jPanels){
        
        
        for (JPanel jPanel : jPanels) {
             Component[] components =   jPanel.getComponents();
        
            for (Component component : components) {
                if(component.getName()!= null){
                    if(component.getName().contains("jLabel__Mensagem")){
                        component.setVisible(false);
                   }
                }
            }
        }
    }
    
    /** Cria a linha para adição de uma nova formação academic
     * @param jTable **/
    public void gerarLinhaFormacaoAcademica(JTable jTable){
  
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        //Gerar nivel formação 
        String[] values = new String[] { "Fundamental", "Médio", "Técnico", "Tecnólogo", "Graduação", "Pós-Graduação", "Mestrado", "Doutorado" };

        TableColumn col = jTable.getColumnModel().getColumn(0);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));
        
        //Gerar status
        values = new String[] { "Em andamento", "Completo", "Incompleto" };

        col = jTable.getColumnModel().getColumn(3);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values)); 
        
        model.addRow(values);
    }
    
    /** Cria a linha para adição de uma nova formação academic
     * @param jTable **/
    public void gerarLinhaIdioma(JTable jTable){

        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        //Gerar nome da lingua
        String[] values = new String[] { "Inglês", "Espanhol", "Francês", "Italiano", "Mandarim", "Russo"};

        TableColumn col = jTable.getColumnModel().getColumn(0);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));
        
        //Gerar nivel fala
        values = new String[] { "Básico", "Intermediário", "Avançado" };

        col = jTable.getColumnModel().getColumn(1);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));    
   
        //Gerar nivel escrita
        values = new String[] { "Básico", "Intermediário", "Avançado" };

        col = jTable.getColumnModel().getColumn(2);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));
        
        //Gerar nivel leitura
        values = new String[] { "Básico", "Intermediário", "Avançado" };

        col = jTable.getColumnModel().getColumn(3);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));
        
         model.addRow(new Object[]{});
    }
    
    /** Cria a linha para adição de uma nova formação academic
     * @param jTable **/
    public void gerarLinhaInformatica(JTable jTable){

        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        //Gerar nome da habilidade
        String[] values = new String[] { "Excel", "AutoCad", "BrOffice", "Word"};

        TableColumn col = jTable.getColumnModel().getColumn(0);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));
        
        //Gerar nivel 
        values = new String[] { "Básico", "Intermediário", "Avançado" };

        col = jTable.getColumnModel().getColumn(1);
        col.setCellEditor(new MyComboBoxEditor(values));
        col.setCellRenderer(new MyComboBoxRenderer(values));    

         model.addRow(new Object[]{});
    } 
    
    /** Cria a linha para adição de uma nova formação academic
     * @param jTable **/
    public void gerarLinhaExperienciaProfissional(JTable jTable){

        ProfissaoDAO profissaoDAO = new ProfissaoDAO();
        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        

        //Gerar nome da habilidade
        Object[] profissoes = profissaoDAO.listarProfissoes().toArray();
        
        TableColumn col = jTable.getColumnModel().getColumn(0);
        col.setCellEditor(new MyComboBoxEditor(profissoes));
        col.setCellRenderer(new MyComboBoxRenderer(profissoes));    

        model.addRow(new Object[]{});
    } 
}
