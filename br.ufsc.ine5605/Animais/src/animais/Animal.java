package animais;

public abstract class Animal {

    private int tamanhoPasso;

    public Animal(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }    
    
    public int getTamanhoPasso() {
        return tamanhoPasso;
    }
     
    public void setTamanhoPasso(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }    

    public String mover() {
        return "ANIMAL: DESLOCOU " + getTamanhoPasso();
    }
    
    public String produzirSom() {
        return "PRODUZ SOM: ";
    }

}