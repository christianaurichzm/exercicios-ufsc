package animais;

public abstract class Ave extends Animal {

    private int alturaVoo;
    
    public Ave(int tamanhoPasso, int alturaVoo) {
        super(tamanhoPasso);
        this.alturaVoo = alturaVoo;
    }
    
    public int getAlturaVoo() {
        return alturaVoo;
    }
    
    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }
   
    public String voar() {
        return super.mover() + " VOANDO";
    }
    
    public String mover() {
        return super.mover() + " VOANDO";
    }
    
    public String produzirSom() {
        return "AVE: " + super.produzirSom();
    }
    
    
}