package Strategy;

public class CartaoPagamento implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Validando cartão...");
        System.out.println("Autorizando operadora...");
        System.out.println("Pagamento no cartão: R$ " + valor);
    }
}
