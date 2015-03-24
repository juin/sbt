package br.com.iomrh.beans;

/**
 *
 * @author Cremildo Lima
 */
public class Curso {
    
    private Integer codigoCurso;
    private String nomeCurso;

    public Curso() {
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return this.nomeCurso; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
