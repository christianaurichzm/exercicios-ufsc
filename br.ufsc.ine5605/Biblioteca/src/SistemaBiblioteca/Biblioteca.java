package SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    
   ArrayList<Livro> livros = new ArrayList<>();
   
   public void incluirLivro(Livro livro) {
        if (!livros.contains(livro) && livro != null) {
            livros.add(livro);
        }
   }
    
   public void excluirLivro(Livro livro) {
        if (livros.contains(livro) && livro != null) {
            livros.remove(livro);
        }
   }
    
}