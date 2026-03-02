package Strategy;

public class PixPagamento implements  PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Gerando chave PIX...");
        System.out.println("Pagamento via PIX: R$ " + valor);
    }
}
