import java.util.Date;

public class Chamado implements IChamado {    
    private String descricao;
    private Cliente cliente;
    private int prioridade;
    private Tecnico tecnico;
    private TipoChamado tipoChamado;
    private String titulo;
    private Date data;

    public Chamado (String descricao, Cliente cliente, int prioridade, Tecnico tecnico, TipoChamado tipoChamado, String titulo, Date data){
        this.descricao = descricao;
        this.cliente = cliente;
        this.prioridade = prioridade;
        this.tecnico = tecnico;
        this.tipoChamado = tipoChamado;
        this.titulo = titulo;
        this.data = data;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }

  
    public String getDescricao() {
        return this.descricao;
    }

   
    public int getPrioridade() {
        return this.prioridade;
    }

  
    public Tecnico getTecnico() {	 	  	  		      	     	     	    	     	        	 	
        return this.tecnico;
    }


    public TipoChamado getTipo() {
        return this.tipoChamado;
    }

   
    public String getTitulo() {
        return this.titulo;
    }    
}