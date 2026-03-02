package Strategy;

public class ProcessadorPagamento {

    private PagamentoStrategy strategy;

    public ProcessadorPagamento(PagamentoStrategy strategy){
        this.strategy = strategy;
    }

    public  void procesar(double valor){
        strategy.pagar(valor);
    }

}
