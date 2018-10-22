import java.util.ArrayList;

public class ControladorPessoas implements IControladorPessoas {
    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Cliente> clientes;
    private ArrayList<Tecnico> tecnicos;

    public ControladorPessoas() {
        clientes = new ArrayList<>();
        tecnicos = new ArrayList<>();
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    @Override
    public ArrayList<Tecnico> getTecnicos() {
        return this.tecnicos;
    }

    @Override
    public IPessoa incluiCliente(int codigo, String nome) {
        cliente = new Cliente(nome, codigo);
        clientes.add(cliente);
        return cliente;     
    }
    
    @Override
    public IPessoa incluiTecnico(int codigo, String nome) {	 	  	  		      	     	     	    	     	        	 	
        if (nome != null) {
            if (!getTecnicos().contains(nome) && !getTecnicos().contains(codigo)) {
                tecnico = new Tecnico(nome, codigo);
                this.tecnicos.add(tecnico);
                return tecnico;
            }
        }
        return null;
    }
}
