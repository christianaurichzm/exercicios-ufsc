package mvc;

import java.util.Scanner;

public class TelaPrincipal {
    
    private Scanner teclado;
    private ControladorPrincipal ctrlPrincipal;
    
    public TelaPrincipal(ControladorPrincipal ctrlPrincipal) {
        this.teclado = new Scanner(System.in);
        this.ctrlPrincipal = ctrlPrincipal;
    }
       
    public void mostraMenuPrincipal() {        
        System.out.println("-------- SISTEMA USUARIOS --------");
        System.out.println("-------- Digite a Opcao Desejada --------");
        System.out.println("0 - Encerra Sistema");
        System.out.println("1 - Cadastro de Usuario");
        
        int opcao = teclado.nextInt();        
        
        ctrlPrincipal.executaOpcaoMenuPrincipal(opcao);       
    }
    
}