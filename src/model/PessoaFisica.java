package model;

import java.util.Date;

public class PessoaFisica {

    private long nrSequencia;
    private String dsPessoaFisica;
    private Date dtNascimento;
    private String cpf;
    private String rg;
    private long cdCidade;
    private String endereco;
    private String bairro;
    private String numero;

    public PessoaFisica() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsPessoaFisica() {
        return dsPessoaFisica;
    }

    public void setDsPessoaFisica(String dsPessoaFisica) {
        this.dsPessoaFisica = dsPessoaFisica;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
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
}
