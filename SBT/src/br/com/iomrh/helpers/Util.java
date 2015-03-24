/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iomrh.helpers;

import br.com.iomrh.beans.Candidato;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cremildo Lima
 */
public class Util {
    
    public String formataData(Date data){
       SimpleDateFormat data_formatada = new SimpleDateFormat("MM-dd-yyyy");
       return data_formatada.format(data.getTime());
    }
    
    public Date criaData(String data_string) throws ParseException{
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(data_string);
        return data;
    }
    
    public boolean buscaCodigoCandidato(List<Candidato> candidatos,Integer codigoCandidato){
        for(Candidato c: candidatos){
            if(c.getCodigoCandidato()==codigoCandidato)
                return true;
        }
        return false;
    }
}
