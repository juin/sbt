/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.listeners;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author joabe_000
 */
public class CadastrarCandidatoListener {
    
    //Inicia os elementos da interface Cadastrar candidato
    public void init(JPanel[] jPanels){
        ocultarTodasMensagens(jPanels);
    }
    

    public void ocultarTodasMensagens(JPanel[] jPanels){
        
        for (JPanel jPanel : jPanels) {
            Component[] components = jPanel.getComponents();
        
            for (Component component : components) {
                JOptionPane.showMessageDialog(null, component.getName());
                if(component instanceof JLabel && 
                        component.getName().contains("jLabel__Mensagem")){

                    component.setVisible(false);
                }
            }
        }
        
    }
}
