public class CategoriaProduto implements ICategoriaProduto {    
    private String nome;
    private int codigo;

    public CategoriaProduto() {
        
    }

    public CategoriaProduto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
            
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }        
}