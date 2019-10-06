package model;

import types.TiposDeFrete;

import java.util.Date;

public class Cotacao {

    private long nrSequencia;
    private long fornecedor;
    private long comprador;
    private long cdMaterial;
    private long nrQuantidade;
    private String marca;
    private Double preco;
    private long cdEstoque;
    private long tipoPagamento;
    private long cdCentroCusto;
    private Date dtEntregaSolic;
    private Date dtEntregaFornec;
    private TiposDeFrete ieFrete;
    private String observacao;
    private long cdItensVencedores;

    public Cotacao() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrCotaco) {
        this.nrSequencia = nrCotaco;
    }

    public long getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(long fornecedor) {
        this.fornecedor = fornecedor;
    }

    public long getComprador() {
        return comprador;
    }

    public void setComprador(long comprador) {
        this.comprador = comprador;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public long getCdEstoque() {
        return cdEstoque;
    }

    public void setCdEstoque(long cdEstoque) {
        this.cdEstoque = cdEstoque;
    }

    public long getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(long tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public long getCdCentroCusto() {
        return cdCentroCusto;
    }

    public void setCdCentroCusto(long cdCentroCusto) {
        this.cdCentroCusto = cdCentroCusto;
    }

    public Date getDtEntregaSolic() {
        return dtEntregaSolic;
    }

    public void setDtEntregaSolic(Date dtEntregaSolic) {
        this.dtEntregaSolic = dtEntregaSolic;
    }

    public Date getDtEntregaFornec() {
        return dtEntregaFornec;
    }

    public void setDtEntregaFornec(Date dtEntregaFornec) {
        this.dtEntregaFornec = dtEntregaFornec;
    }

    public TiposDeFrete getIeFrete() {
        return ieFrete;
    }

    public void setIeFrete(TiposDeFrete ieFrete) {
        this.ieFrete = ieFrete;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public long getCdItensVencedores() {
        return cdItensVencedores;
    }

    public void setCdItensVencedores(long cdItensVencedores) {
        this.cdItensVencedores = cdItensVencedores;
    }
}

