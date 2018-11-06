package swing;

public class ControladorPrincipal {    
    private TelaPrincipal tela;   
    private static ControladorPrincipal instancia = new ControladorPrincipal();
    
    public ControladorPrincipal() {
        tela = new TelaPrincipal();
    }
    
    public static ControladorPrincipal getInstancia() {        
        if (instancia == null) {
            instancia = new ControladorPrincipal();
        }        
        return instancia;
    }
    
    public void inicia() {
        tela.setVisible(true);
    }
    
    public void addNome(String text) {
        System.out.println("Nome: " + text + " adicionado!!");
    }
    
}
