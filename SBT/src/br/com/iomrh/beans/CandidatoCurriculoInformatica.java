package br.com.iomrh.beans;

/**
 *
 * @author Cremildo Lima
 */
public class CandidatoCurriculoInformatica {
    
    private Integer codigoCandidato;
    private Integer codigoCurriculoInformatica;

    public CandidatoCurriculoInformatica() {
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public Integer getCodigoCurriculoInformatica() {
        if(this.codigoCurriculoInformatica == null)
            return 0;
        return codigoCurriculoInformatica;
    }

    public void setCodigoCurriculoInformatica(Integer codigoCurriculoInformatica) {
        this.codigoCurriculoInformatica = codigoCurriculoInformatica;
    }
}
