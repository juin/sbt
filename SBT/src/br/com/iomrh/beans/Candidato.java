package br.com.iomrh.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Cremildo Lima
 */

public class Candidato{

    private Integer codigoCandidato;
    private String prenome;
    private String sobrenome;
    private String cnhCategoria;
    private String sexo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Short quantidadeFilhos;
    private String estadoCivil;
    private String email;
    private String disponibilidadeViajar;
    private String tipoNecessidadeEspecial;
    private String portadorNecessidadesEspeciais;
    private double pretensaoSalarial;
    private String veiculo;
    private String primeiroEmprego;
    private String gerencia;
    private Integer codProfissao;

    private List<CurriculoInformatica> curriculoInformaticaList;
    private List<CurriculoIdioma> curriculoIdiomaList;
    private List<HistoricoCandidato> historicoCandidatoList;
    private List<Endereco> enderecoList;
    private List<CaracteristicasCandidato> caracteristicasCandidatoList;
    private List<Telefone> telefoneList;
    private List<RedeSocial> redeSocialList;
    private List<Formacao> formacaoList;
    private List<IndisponibilidadeCandidato> indisponibilidadeCandidatoList;
    private List<ExperienciaProfissional> experienciaProfissionalList;
    
    public Candidato() {
        experienciaProfissionalList = new ArrayList<>();
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public String getPrenome() {
        return prenome;
    }

    public void setPrenome(String prenome) {
        this.prenome = prenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCnhCategoria() {
        return cnhCategoria;
    }

    public void setCnhCategoria(String cnhCategoria) {
        this.cnhCategoria = cnhCategoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Short getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(Short quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisponibilidadeViajar() {
        return disponibilidadeViajar;
    }

    public void setDisponibilidadeViajar(String disponibilidadeViajar) {
        this.disponibilidadeViajar = disponibilidadeViajar;
    }

    public String getTipoNecessidadeEspecial() {
        return tipoNecessidadeEspecial;
    }

    public void setTipoNecessidadeEspecial(String tipoNecessidadeEspecial) {
        this.tipoNecessidadeEspecial = tipoNecessidadeEspecial;
    }

    public String getPortadorNecessidadesEspeciais() {
        return portadorNecessidadesEspeciais;
    }

    public void setPortadorNecessidadesEspeciais(String portadorNecessidadesEspeciais) {
        this.portadorNecessidadesEspeciais = portadorNecessidadesEspeciais;
    }

    public double getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(double pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPrimeiroEmprego() {
        return primeiroEmprego;
    }

    public void setPrimeiroEmprego(String primeiroEmprego) {
        this.primeiroEmprego = primeiroEmprego;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public Integer getCodProfissao() {
        return codProfissao;
    }

    public void setCodProfissao(int codProfissao) {
        this.codProfissao = codProfissao;
    }
    
    public List<CurriculoInformatica> getCurriculoInformaticaList() {
        return curriculoInformaticaList;
    }

    public void setCurriculoInformaticaList(List<CurriculoInformatica> curriculoInformaticaList) {
        this.curriculoInformaticaList = curriculoInformaticaList;
    }

    public List<CurriculoIdioma> getCurriculoIdiomaList() {
        return curriculoIdiomaList;
    }

    public void setCurriculoIdiomaList(List<CurriculoIdioma> curriculoIdiomaList) {
        this.curriculoIdiomaList = curriculoIdiomaList;
    }
    
    public List<HistoricoCandidato> getHistoricoCandidatoList() {
        return historicoCandidatoList;
    }

    public void setHistoricoCandidatoList(List<HistoricoCandidato> historicoCandidatoList) {
        this.historicoCandidatoList = historicoCandidatoList;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public List<CaracteristicasCandidato> getCaracteristicasCandidatoList() {
        return caracteristicasCandidatoList;
    }

    public void setCaracteristicasCandidatoList(List<CaracteristicasCandidato> caracteristicasCandidatoList) {
        this.caracteristicasCandidatoList = caracteristicasCandidatoList;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    public List<RedeSocial> getRedeSocialList() {
        return redeSocialList;
    }

    public void setRedeSocialList(List<RedeSocial> redeSocialList) {
        this.redeSocialList = redeSocialList;
    }

    public List<Formacao> getFormacaoList() {
        return formacaoList;
    }

    public void setFormacaoList(List<Formacao> formacaoList) {
        this.formacaoList = formacaoList;
    }

    public List<IndisponibilidadeCandidato> getIndisponibilidadeCandidatoList() {
        return indisponibilidadeCandidatoList;
    }

    public void setIndisponibilidadeCandidatoList(List<IndisponibilidadeCandidato> indisponibilidadeCandidatoList) {
        this.indisponibilidadeCandidatoList = indisponibilidadeCandidatoList;
    }

    public List<ExperienciaProfissional> getExperienciaProfissionalList() {
        return experienciaProfissionalList;
    }

    public void setExperienciaProfissionalList(List<ExperienciaProfissional> experienciaProfissionalList) {
        this.experienciaProfissionalList = experienciaProfissionalList;
    }
    
    public void addExperienciaProfissionalList(ExperienciaProfissional expPro){
        this.experienciaProfissionalList.add(expPro);
    }
    
    public boolean buscaExperienciaProfissionalList(Integer expPro){
        for(ExperienciaProfissional ep : experienciaProfissionalList){
            if(expPro == ep.getCodigoProfissao()){
                return true;
            }
        }
        return false;
    }
    
    public Integer buscaDuracaoExperienciaProfissionalList(Integer expPro){
        Integer duracao = 0;
        for(ExperienciaProfissional ep : experienciaProfissionalList){
            if(expPro == ep.getCodigoProfissao()){
                duracao = duracao + ep.getDuracao();
            }
        }
        return duracao;
    }
    
    public List<Integer> listaExperienciasProfissionais(){
        List<Integer> expPro = new ArrayList<Integer>();
        for(ExperienciaProfissional ep : experienciaProfissionalList){
            expPro.add(ep.getCodigoProfissao());
        }
        
       return expPro;     
    }

}
