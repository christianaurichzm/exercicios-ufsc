import java.util.ArrayList;

public interface IControladorPessoas {

    public ArrayList<Cliente> getClientes();

    public ArrayList<Tecnico> getTecnicos();

    public IPessoa incluiCliente(int codigo, String nome);

    public IPessoa incluiTecnico(int codigo, String nome);
    
}
