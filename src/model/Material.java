package model;

public class Material {

    private long nrSequencia;
    private String dsMaterial;
    private long cdMarca;

    public Material() {

    }

    public long getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(long nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public String getDsMaterial() {
        return dsMaterial;
    }

    public void setDsMaterial(String dsMaterial) {
        this.dsMaterial = dsMaterial;
    }

    public long getCdMarca() {
        return cdMarca;
    }

    public void setcdMarcas(long marcas) {
        this.cdMarca = marcas;
    }
}
