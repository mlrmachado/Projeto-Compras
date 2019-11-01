package model;

import DAO.CentroCustoDAO;

public class CentroCusto {

    private long nrSequencia;
    private String dsCentroCusto;

    public CentroCusto() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsCentroCusto() {
        return dsCentroCusto;
    }

    public void setDsCentroCusto(String dsCentroCusto) {
        this.dsCentroCusto = dsCentroCusto;
    }

    public void salvar () throws Exception {
        CentroCustoDAO centroCustoDAO = new CentroCustoDAO();
        centroCustoDAO.salvar(this);


    }
}
