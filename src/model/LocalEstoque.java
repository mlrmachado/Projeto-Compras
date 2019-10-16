package model;

public class LocalEstoque {

    private long nrSequencia;
    private String dsLocalEstoque;
    private long cdCentroCusto;

    public LocalEstoque() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsLocalEstoque() {
        return dsLocalEstoque;
    }

    public void setDsLocalEstoque(String dsLocalEstoque) {
        this.dsLocalEstoque = dsLocalEstoque;
    }

    public long getCdCentroCusto() {
        return cdCentroCusto;
    }

    public void setcdCentroCusto(long cdcentroCusto) {
        cdCentroCusto = cdcentroCusto;
    }
}
