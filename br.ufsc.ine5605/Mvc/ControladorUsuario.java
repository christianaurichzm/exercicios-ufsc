package mvc;

import java.util.ArrayList;

public class ControladorUsuario {

    private ControladorPrincipal ctrlPrincipal;
    private TelaUsuario telaUsuario;
    private ArrayList<Usuario> usuarios;
    
    public ControladorUsuario(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.telaUsuario = new TelaUsuario(this);
        this.usuarios = new ArrayList<>();
    }

    public void mostraMenuUsuario() {
        telaUsuario.mostraMenuUsuario();
    }

    public void incluiUsuario(ConteudoTelaUsuario conteudoTela) {
        Usuario usuario = desempacota(conteudoTela);
        usuarios.add(usuario);
    }    

    void retornaMenuPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void listaUsuarios() {
        ArrayList<ConteudoTelaUsuario> listagemUsuarios = new ArrayList<>();
        
        for (Usuario usuario : usuarios) {
            listagemUsuarios.add(empacota(usuario));
        }
        
        telaUsuario.mostraListaUsuarios(listagemUsuarios);        
    }

    private Usuario desempacota(ConteudoTelaUsuario conteudoTela) {
        return new Usuario(conteudoTela.nomeUsuario);
    }
    
    private ConteudoTelaUsuario empacota(Usuario usuario) {
        return new ConteudoTelaUsuario(usuario.getNome());
    }
    
}