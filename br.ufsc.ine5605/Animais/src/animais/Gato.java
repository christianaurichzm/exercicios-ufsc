package animais;

public class Gato extends Mamifero {
    
    public Gato() {
        super(2, 2);
    }
    
    public String miar() {
        return super.produzirSom() + getVolumeSom() + " SOM: MIAU";
    }

}
