package model;

public class Setor {

    private long nrSequencia;
    private String dsSetor;
    private long cdCentroCusto;
    private long cdLocalEstoque;

    public Setor() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsSetor() {
        return dsSetor;
    }

    public void setDsSetor(String dsSetor) {
        this.dsSetor = dsSetor;
    }

    public long getCdCentroCusto() {
        return cdCentroCusto;
    }

    public void setCdCentroCusto(long cdCentroCusto) {
        this.cdCentroCusto = cdCentroCusto;
    }

    public long getCdLocalEstoque() {
        return cdLocalEstoque;
    }

    public void setCdLocalEstoque(long cdLocalEstoque) {
        this.cdLocalEstoque = cdLocalEstoque;
    }
}
