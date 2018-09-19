package mvc;


public class ControladorPrincipal {

    private TelaPrincipal telaPrincipal;
    private ControladorUsuario ctrlUsuario;

    public ControladorPrincipal() {        
        this.telaPrincipal = new TelaPrincipal(this);
        this.ctrlUsuario = new ControladorUsuario(this);        
    }  
        
    public void iniciaSistema() {        
        telaPrincipal.mostraMenuPrincipal();        
    }

    public void executaOpcaoMenuPrincipal(int opcao) {        
        switch(opcao) {
            case 0: encerra();
                break;
            case 1: ctrlUsuario.mostraMenuUsuario();
                break;
        }        
    }

    public void encerra() {
        
    }
    
}