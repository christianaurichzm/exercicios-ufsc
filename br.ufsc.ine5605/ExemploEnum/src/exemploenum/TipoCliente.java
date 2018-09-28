package exemploenum;

public enum TipoCliente {
    ESPECIAL("Pode Vender com Desconto"),
    COMUM("Pode Vender"),
    DEVEDOR("Verifique saldo devedor");
    
    public final String mensagem;
    
    TipoCliente(String mensagemRecebida) {
        mensagem = mensagemRecebida;
}
