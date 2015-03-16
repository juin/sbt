package br.com.iomrh.beans;

/**
 *
 * @author Cremildo Lima
 */
public class CandidatoCurriculoIdioma {
    
    private Integer codigoCandidato;
    private Integer codigoCurriculoIdioma;

    public CandidatoCurriculoIdioma() {
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public Integer getCodigoCurriculoIdioma() {
        if(this.codigoCurriculoIdioma == null)
            return 0;
        return codigoCurriculoIdioma;
    }

    public void setCodigoCurriculoIdioma(Integer codigoCurriculoIdioma) {
        this.codigoCurriculoIdioma = codigoCurriculoIdioma;
    }
    
    
}
