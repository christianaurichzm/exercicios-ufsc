public interface IControladorProdutos {
    public void atualizaPrecos(float inflacao);    
    public IProduto getProdutoPeloCodigo(int codigo);
    public ICategoriaProduto incluiCategoriaProduto(int codigo, String nome);    
    public IProduto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria);    
}