public class Pessoa implements IPessoa {
    private String nome;
    private int codigo;

    public Pessoa (String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
}