 import java.util.ArrayList;
 import java.util.Date;
 
 public class ControladorChamados implements IControladorChamados {
    private Date data;
    private Cliente cliente;
    private Tecnico tecnico;
    private String titulo;
    private String descricao;
    private int prioridade;
    private ITipoChamado tipoChamado;
    private IChamado chamado;
    private ArrayList<IChamado> chamados;
    private ArrayList<ITipoChamado> tiposChamado;
    private ControladorPessoas controladorPessoa;

    public ControladorChamados() {
        chamados = new ArrayList<>();
        tiposChamado = new ArrayList<>();
        controladorPessoa = new ControladorPessoas();
    }


    public int getTotalChamadosPorTipo(TipoChamado tipo) {
        int x = 0;
        for (IChamado c : chamados) {
            if (c.getTipo().getCodigo() == tipo.getCodigo()) {
                x++;
            }
        }
        return x;
    }
    
    public boolean temTipo(int codigo) {
        boolean jahTem = false;
        for (ITipoChamado tipo : tiposChamado) {
            if (tipo.getCodigo() == codigo) {	 	  	  		      	     	     	    	     	        	 	
                jahTem = true;
            } 
        }
        return jahTem;
    }
    
    public ITipoChamado incluiTipoChamado(int codigo, String descricao, String nome) {
        if (!temTipo(codigo)) {
            tipoChamado = new TipoChamado(codigo, descricao, nome);
            tiposChamado.add(tipoChamado);
            return tipoChamado;
        }
        return null;
    }

    public IChamado incluiChamado(Date data, Cliente cliente, Tecnico tecnico, String titulo, String descricao, int prioridade, TipoChamado tipo) {
        if (!(tecnico == null || cliente == null || tipo == null)) {
            chamado = new Chamado(descricao, cliente, prioridade, tecnico, tipo, titulo, data);
            chamados.add(chamado);
            return chamado;
        }

        return null;
    }
} 	  	  		      	     	     	    	     	        	 	
