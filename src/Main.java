import Builder.Pessoa;
import Builder.PessoaBuilder;
import Factory.VideoGameFactory;
import Factory.VideogameType;
import Strategy.PagamentoStrategy;
import Strategy.PixPagamento;
import Strategy.ProcessadorPagamento;

public class Main {

    public static void main(String[] args) {

        //Builder

        Pessoa pessoa = PessoaBuilder.create()
                .nome("Lucas")
                .idade(23)
                .sexo("Masculino")
                .build();

        System.out.println(pessoa);

        //Factory

        VideoGameFactory.getVideoGame(VideogameType.PS2).ligar();

        //Strategy
        PagamentoStrategy strategy = new PixPagamento();

        ProcessadorPagamento procesador = new ProcessadorPagamento(strategy);
        procesador.procesar(150.50);


    }

}