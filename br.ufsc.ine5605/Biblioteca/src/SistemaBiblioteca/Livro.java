package SistemaBiblioteca;

import java.util.ArrayList;

public class Livro {
    
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private int numeroCapitulo;
    ArrayList<Autor> autores;
    ArrayList<Capitulo> capitulos;
    
    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;        
        autores = new ArrayList<>();
        autores.add(autor);
        capitulos = new ArrayList<>();
        capitulos.add(new Capitulo(numeroCapitulo, tituloCapitulo));
    }
                
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }
    
    public Editora getEditora() {
        return editora;
    } 
    
    public ArrayList<Autor> getAutores() {
        return autores;
    } 

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  
    
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public boolean temAutor(Autor autor) {
        for (Autor a : autores) {
            if (a.getCodigo() != autor.getCodigo()){
               return false; 
            }
        }
        return true;
    }    
    
    
    public void incluirAutor(Autor autor) {        
       if (autor != null && !temAutor(autor) && !autores.contains(autor)) {
           autores.add(autor);          
        }          
    }
    
    public void excluirAutor(Autor autor) {
       if (autor != null && autores.contains(autor)) {
            autores.remove(autor);            
       }
    }
    
    public void incluirCapitulo(int numero, String tituloCapitulo) {
        if (!capitulos.contains(encontrarCapituloPeloTitulo(tituloCapitulo))) {
            capitulos.add(new Capitulo(numero, tituloCapitulo));
        }
    }
    
    public void excluirCapitulo(String tituloCapitulo) {
        if (capitulos.contains(encontrarCapituloPeloTitulo(tituloCapitulo))) {
            capitulos.remove(encontrarCapituloPeloTitulo(tituloCapitulo));
        }
    }
    
    public Capitulo encontrarCapituloPeloTitulo(String capTitulo) {
        for (Capitulo c : capitulos) {
            if (c.getTitulo().equals(capTitulo)){
               return c; 
            }
        }
        return null;
    }
    
}