package animais;

public class Cachorro extends Mamifero {
    
    public Cachorro() {
        super(3, 3);
    }
    
    public String latir() {
        return super.produzirSom() + getVolumeSom() + " SOM: AU";
    }
  
    
    

}