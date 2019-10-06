package types;

public enum TiposDeFrete {
    FRETE_POR_CONTA_FORNECEDOR("CIF"),
    FRETE_POR_CONTA_COMPRADOR("FOB"),
    SEM_FRETE("SF");

    private final String valor;
    TiposDeFrete (String valorOpcao){
        valor = valorOpcao;
    }

    public String getValor() {
        return valor;
    }
}
