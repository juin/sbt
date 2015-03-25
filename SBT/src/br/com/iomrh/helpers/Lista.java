/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.helpers;

import br.com.iomrh.beans.Candidato;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Cremildo Lima
 * @param <T>
 */
public class Lista<T> extends ArrayList<T>{
    
    public Lista() {
        super(); //chame o construtor de ArrayList
    }
    
    public boolean contains(Integer o){
       
        for(int i=0; i< this.size(); i++){
        
             Candidato paraComparar = (Candidato)this.get(i);
             
             if(o==paraComparar.getCodigoCandidato()){
                return true;
            }
        }
        return false;
    }
}
