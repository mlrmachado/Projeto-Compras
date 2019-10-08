package model;

public class Comprador {

    private  long nrSequencia;
    private  String dsComprador;
    private long cdUsuario;

    public Comprador() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsComprador() {
        return dsComprador;
    }

    public void setDsComprador(String dsComprador) {
        this.dsComprador = dsComprador;
    }

    public long getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(long cdUsuario) {
        this.cdUsuario = cdUsuario;
    }
}
