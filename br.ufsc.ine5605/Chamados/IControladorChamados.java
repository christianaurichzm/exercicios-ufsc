import java.util.Date;

public interface IControladorChamados {

    int getTotalChamadosPorTipo(TipoChamado tipo);
   
    IChamado incluiChamado(Date data, Cliente cliente, Tecnico tecnico, String titulo, String descricao, int prioridade, TipoChamado tipo);

    ITipoChamado incluiTipoChamado(int codigo, String nome, String descricao);
    
}
