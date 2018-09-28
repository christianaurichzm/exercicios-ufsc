package exemploenum;

public class Cliente {
    private int cpf;
    private String nome;
    private TipoCliente tipoCliente;
    
    //Constantes
    
    // public static enum TipoCliente{ESPECIAL, COMUM , DEVEDOR};
    
    /**
     * Tipos de Cliente: <br>
     * 0 - ESPECIAL <br>
     * 1 - COMUM <br>
     * 2 - DEVEDOR <br>
     */
   
    /* public static final String[] TIPO = {"ESPECIAL", "COMUM", "DEVEDOR"};
    
    public static final String ESPECIAL = "ESPECIAL";
    public static final String COMUM = "COMUM";
    public static final String DEVEDOR = "DEVEDOR"; */

    public Cliente(int cpf, String nome, TipoCliente tipoCliente) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }            
}