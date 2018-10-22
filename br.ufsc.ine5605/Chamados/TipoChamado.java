public class TipoChamado implements ITipoChamado {
    private int codigo;
    private String descricao;
    private String nome;

    public TipoChamado(int codigo, String descricao, String nome){
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

 
    public String getDescricao() {
        return this.descricao;
    }

    public String getNome() {
        return this.nome;
    }
    
}