/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author joabe_000
 */
public class Main {
    public static void main(String[] args) {
        Conexao conexao =  new Conexao();
        JOptionPane.showMessageDialog(null, conexao.getConexao());
    }
}
