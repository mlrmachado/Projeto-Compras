package model;

import java.util.Date;

public class Ordem {
    private long nrSequencia;
    private long cdComprador;
    private long cdFornecedor;
    private long cdMaterial;
    private long nrQuantidade;
    private double precoMaterial;
    private Date dtEntrega;
    private long cdMarca;
    private String cdEstoque;
    private long cdCentroCusto;
    private String observacao;
    private long cdMotivo;

    public Ordem() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public long getCdComprador() {
        return cdComprador;
    }

    public void setCdComprador(long cdComprador) {
        this.cdComprador = cdComprador;
    }

    public long getCdFornecedor() {
        return cdFornecedor;
    }

    public void setCdFornecedor(long cdFornecedor) {
        this.cdFornecedor = cdFornecedor;
    }

    public long getCdMaterial() {
        return cdMaterial;
    }

    public void setCdMaterial(long cdMaterial) {
        this.cdMaterial = cdMaterial;
    }

    public long getNrQuantidade() {
        return nrQuantidade;
    }

    public void setNrQuantidade(long nrQuantidade) {
        this.nrQuantidade = nrQuantidade;
    }

    public double getPrecoMaterial() {
        return precoMaterial;
    }

    public void setPrecoMaterial(double precoMaterial) {
        this.precoMaterial = precoMaterial;
    }

    public Date getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(Date dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public long getCdMarca() {
        return cdMarca;
    }

    public void setNrMarca(long nrMarca) {
        this.cdMarca = cdMarca;
    }

    public String getCdEstoque() {
        return cdEstoque;
    }

    public void setCdEstoque(String cdEstoque) {
        this.cdEstoque = cdEstoque;
    }

    public long getCdCentroCusto() {
        return cdCentroCusto;
    }

    public void setCdCentroCusto(long cdCentroCusto) {
        this.cdCentroCusto = cdCentroCusto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public long getCdMotivo() {
        return cdMotivo;
    }

    public void setCdMotivo(long cdMotivo) {
        this.cdMotivo = cdMotivo;
    }
}

