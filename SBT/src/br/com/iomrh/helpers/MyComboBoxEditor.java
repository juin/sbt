/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.helpers;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

/**
 *
 * @author joabe_000
 */

class MyComboBoxEditor extends DefaultCellEditor {
  public MyComboBoxEditor(String[] items) {
    super(new JComboBox(items));
  }
}