package model;

import java.util.Date;

public class Usuario {

    private long nrSequencia;
    private String dsUsuario;
    private String senha;
    private long cdPessoaFisica;
    private long setor;

    public Usuario() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsUsuario() {
        return dsUsuario;
    }

    public void setDsUsuario(String dsUsuario) {
        this.dsUsuario = dsUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getCdPessoaFisica() {
        return cdPessoaFisica;
    }

    public void setCdPessoaFisica(long cdPessoaFisica) {
        this.cdPessoaFisica = cdPessoaFisica;
    }

    public long getSetor() {
        return setor;
    }

    public void setSetor(long setor) {
        this.setor = setor;
    }
}

