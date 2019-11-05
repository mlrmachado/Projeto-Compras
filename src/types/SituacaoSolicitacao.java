package types;

public enum SituacaoSolicitacao {
    LIBERADA("Lib"),
    ENVIADO_COTACAO("EC"),
    ORDEM_COMPRA_REALIZDA("OR");

    private final String valor;
    SituacaoSolicitacao (String valorOpcao){
        valor = valorOpcao;
    }

    public String getValor() {
        return valor;
    }


}
