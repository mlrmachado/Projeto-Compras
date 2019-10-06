package model;

import types.SituacaoSolicitacao;

import java.util.Date;

public class Solicitacao {
    private long nrSequencia;
    private String solicitanteSolicitacao;
    private long cdMaterial;
    private long nrQuantidade;
    private Date dtPedido;
    private Date dtEntrega;
    private long cdEstoque;
    private long cdCentroCusto;
    private SituacaoSolicitacao ieSituacao;
    private String marca;
    private String observacao;
    private long cdMotivo;

    public Solicitacao() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getSolicitanteSolicitacao() {
        return solicitanteSolicitacao;
    }

    public void setSolicitanteSolicitacao(String solicitanteSolicitacao) {
        this.solicitanteSolicitacao = solicitanteSolicitacao;
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

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Date getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(Date dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public long getCdEstoque() {
        return cdEstoque;
    }

    public void setCdEstoque(long cdEstoque) {
        this.cdEstoque = cdEstoque;
    }

    public long getCdCentroCusto() {
        return cdCentroCusto;
    }

    public void setCdCentroCusto(long cdCentroCusto) {
        this.cdCentroCusto = cdCentroCusto;
    }

    public SituacaoSolicitacao getIeSituacao() {
        return ieSituacao;
    }

    public void setIeSituacao(SituacaoSolicitacao ieSituacao) {
        this.ieSituacao = ieSituacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
