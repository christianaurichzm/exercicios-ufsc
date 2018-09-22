public class Produto implements IProduto {    
    private int codigo;
    private String descricao;
    private String nome;
    private float preco;
    private int quantidade;
    private CategoriaProduto categoria;

    public Produto() {
        
    }

    public Produto(int codigo, String descricao, String nome, float preco, int quantidade, CategoriaProduto categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }        
    
    public CategoriaProduto getCategoria() {
        return categoria;        
    }
    
    public int getCodigo() {
        return codigo;        
    }
    
    public String getDescricao() {
        return descricao;        
    }
    
    public String getNome() {
        return nome;        
    }
    
    public float getPreco() {
        return preco;        
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;   
    }    
}