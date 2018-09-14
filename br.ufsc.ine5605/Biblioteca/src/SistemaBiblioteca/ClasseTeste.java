package SistemaBiblioteca;

import java.util.ArrayList;

public class ClasseTeste {
    
    public static void main(String[] args) {
        
        // Criando editoras
        Editora editora1 = new Editora(1, "Atico");
        Editora editora2 = new Editora(1, "Letras");
        
        // Criando autores
        Autor autor1 = new Autor(1, "Jorge");
        Autor autor2 = new Autor(2, "Mark");
       
        // Criando livro
        Livro livro1 = new Livro(1, "UML", 1999, editora1, autor1, 1, "Diagrama");
               
        // Incluindo capítulos de mesmo título no livro criado
        livro1.incluirCapitulo(2, "Diagrama Parte 2");
        livro1.incluirCapitulo(3, "Diagrama Parte 2");
        
        // Testando inclusão de autores repetidos no livro
        livro1.incluirAutor(autor2);
        livro1.incluirAutor(autor2);
        
        ArrayList<Autor> autoresTeste = new ArrayList<>();      
        ArrayList<Capitulo> capitulosTeste = new ArrayList<>(); 
                        
        autoresTeste = livro1.autores;  
        capitulosTeste = livro1.capitulos;            
                
        // Imprimindo autores do livro1
        System.out.println("Autores do livro1:");
        for (Autor a : autoresTeste) {
            System.out.println(a.getCodigo() + " " + a.getNome());
        }
        
        // Imprimindo capítulos do livro1
        System.out.println("Capítulos do livro1:");
        for (Capitulo a : capitulosTeste) {
            System.out.println(a.getNumero() + " " + a.getTitulo());
        }
      
        // Testando exclusão de autor
        livro1.excluirAutor(autor2);
        
        System.out.println("Autores do livro1 após exclusão de autor:");
        for (Autor a : autoresTeste) {
            System.out.println(a.getCodigo() + " " + a.getNome());
        }
        
    }
}