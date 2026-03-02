package Strategy;

public class BoletoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Gerando código de barras...");
        System.out.println("Pagamento via boleto: R$ " + valor);
    }

}
