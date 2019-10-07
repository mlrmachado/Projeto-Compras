package model;

public class PessoaJuridica {
    private long nrSequencia;
    private String cnpj;
    private String dsRazaoSocial;
    private String dsNomeFantasia;
    private long cdCidade;
    private String endereco;
    private String bairro;
    private String numero;
    private String cdInscricacaoEstadual;

    public PessoaJuridica() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDsRazaoSocial() {
        return dsRazaoSocial;
    }

    public void setDsRazaoSocial(String dsRazaoSocial) {
        this.dsRazaoSocial = dsRazaoSocial;
    }

    public String getDsNomeFantasia() {
        return dsNomeFantasia;
    }

    public void setDsNomeFantasia(String dsNomeFantasia) {
        this.dsNomeFantasia = dsNomeFantasia;
    }

    public long getCdCidade() {
        return cdCidade;
    }

    public void setCdCidade(long cdCidade) {
        this.cdCidade = cdCidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCdInscricacaoEstadual() {
        return cdInscricacaoEstadual;
    }

    public void setCdInscricacaoEstadual(String cdInscricacaoEstadual) {
        this.cdInscricacaoEstadual = cdInscricacaoEstadual;
    }
}


