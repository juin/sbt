/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.helpers;

import br.com.iomrh.beans.Profissao;
import br.com.iomrh.dao.ProfissaoDAO;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

/**
 * Essa classe conntem todos os validadores da aplicação
 * @author 
 */
public class Validadores {
    
    public static ArrayList<String> NotEmpty(Component[] fieldsObrigatorios){
       ArrayList result;
       result = new ArrayList<>();
        
        for (int i = 0; i < fieldsObrigatorios.length; i++) {  
          
           if (fieldsObrigatorios[i] instanceof JTextField) {
                JTextField jTextField  =  (JTextField) fieldsObrigatorios[i];
                
                if(jTextField.getText().isEmpty()){
                  jTextField.setBorder(new LineBorder(Color.RED)); 
                  result.add("O campo " + jTextField.getName() + " está vazio");
                }
           }     
            
            if (fieldsObrigatorios[i] instanceof JComboBox) {
                JComboBox jComboBox  =  (JComboBox) fieldsObrigatorios[i];

                if(jComboBox.getSelectedItem().toString().isEmpty()){
                  jComboBox.setBorder(new LineBorder(Color.RED)); 
                  result.add("O campo " + jComboBox.getName() + " está vazio");
                }
           }     
        }
        return result;
    }
    
    /**
	 * Converte uma String para um objeto Date. Caso a String seja vazia ou nula, 
	 * retorna null - para facilitar em casos onde formulários podem ter campos
	 * de datas vazios.
	 * @param data String no formato dd/MM/yyyy a ser formatada
	 * @return Date Objeto Date ou null caso receba uma String vazia ou nula
	 * @throws Exception Caso a String esteja no formato errado
	 */
	public static Date formataData(String data) throws Exception { 
		if (data == null || data.equals(""))
			return null;
		
        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date)formatter.parse(data);
        } catch (ParseException e) {            
            throw e;
        }
        return date;
	}    
}
