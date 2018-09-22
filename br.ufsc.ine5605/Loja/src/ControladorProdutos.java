import java.util.ArrayList;
import java.util.List;

public class ControladorProdutos implements IControladorProdutos {
    private float inflacao;
    private List<Produto> produtos = new ArrayList<>();
    private List<CategoriaProduto> categorias = new ArrayList<>();

    public ControladorProdutos() {

    }

    public void atualizaPrecos(float inflacao) {
        for (Produto produto : produtos) {
            produto.setPreco(produto.getPreco() * (1 + inflacao));
        }
    }

    public IProduto getProdutoPeloCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public ICategoriaProduto incluiCategoriaProduto(int codigo, String nome) {
        CategoriaProduto categoria = new CategoriaProduto(nome, codigo);
        categorias.add(categoria);
        return categoria;
    }

    public IProduto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria) {
        Produto produto = new Produto(codigo, descricao, nome, preco, quantidade, categoria);
        produtos.add(produto);
        return produto;
    }
}