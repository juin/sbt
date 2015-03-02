package br.com.iomrh.beans;

import java.util.Date;

/**
 *
 * @author Cremildo Lima
 */
public class Log {

    private Long codigoLog;
    private String tabela;
    private Date dataHora;
    private Integer codigoColaborador;
    private Integer codigoRegistroAlterado;
    private String ip;
    private String acao;
    private String valorAnterior;
    private String valorNovo;

    public Log() {
    }

    public Long getCodigoLog() {
        return codigoLog;
    }

    public void setCodigoLog(Long codigoLog) {
        this.codigoLog = codigoLog;
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getCodigoColaborador() {
        return codigoColaborador;
    }

    public void setCodigoColaborador(int codigoColaborador) {
        this.codigoColaborador = codigoColaborador;
    }

    public int getCodigoRegistroAlterado() {
        return codigoRegistroAlterado;
    }

    public void setCodigoRegistroAlterado(int codigoRegistroAlterado) {
        this.codigoRegistroAlterado = codigoRegistroAlterado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public String getValorNovo() {
        return valorNovo;
    }

    public void setValorNovo(String valorNovo) {
        this.valorNovo = valorNovo;
    }

    @Override
    public String toString() {
        return "bancodetalentos.Log[ codigoLog=" + codigoLog + " ]";
    }
    
}
