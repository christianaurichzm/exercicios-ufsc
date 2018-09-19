package mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaUsuario {

    private ControladorUsuario ctrlUsuario;
    private Scanner teclado;
    
    public TelaUsuario(ControladorUsuario ctrlUsuario) {
        this.ctrlUsuario = ctrlUsuario;
        this.teclado = new Scanner(System.in);
    }

    public void mostraMenuUsuario() {
        int opcao;
        
        do {       
            System.out.println("-------- CADASTRO USUARIO --------");
            System.out.println("-------- Escolha a opcao desejada --------");
            System.out.println("1 - Novo Usuario");
            System.out.println("2 - Alterar Usuario");
            System.out.println("3 - Excluir Usuario");
            System.out.println("4 - Listar Usuarios");
            System.out.println("0 - Voltar Tela Principal");
            opcao = leValorInteiro();
       
            switch(opcao) {
                case 1: mostraTelaNovoUsuario();
                    break;
                case 4: ctrlUsuario.listaUsuarios();
                    break;
            }
        
        } while(opcao!=0);
            ctrlUsuario.retornaMenuPrincipal();                           
    }

    public void mostraTelaNovoUsuario() {
        System.out.println("-------- NOVO USUARIO --------");
        System.out.println("Nome do Usuario");
        ConteudoTelaUsuario conteudoTela = new ConteudoTelaUsuario();
        conteudoTela.nomeUsuario = teclado.nextLine();
        ctrlUsuario.incluiUsuario(conteudoTela);
    }

    private int leValorInteiro() {
        int inteiro = teclado.nextInt();
        teclado.nextLine();
        return inteiro;
    }

    public void mostraListaUsuarios(ArrayList<ConteudoTelaUsuario> listagemUsuarios) {
        System.out.println("-------- LISTAGEM DE USUARIOS --------");
        for (ConteudoTelaUsuario conteudoTela : listagemUsuarios) {
            System.out.println("Nome: " + conteudoTela.nomeUsuario);
        }
        
        System.out.println("----------------");
    }
    
}