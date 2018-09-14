package SistemaBiblioteca;

public class Capitulo {
    
    private int numero;
    private String titulo;
    
    public Capitulo(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}