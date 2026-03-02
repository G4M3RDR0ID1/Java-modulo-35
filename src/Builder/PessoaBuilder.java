package Builder;

public class PessoaBuilder {

    private String nome;
    private int idade;
    private String sexo;

    public static PessoaBuilder create(){
        return new PessoaBuilder();
    }

    public PessoaBuilder nome(String nome){
        this.nome = nome;
        return this;
    }

    public PessoaBuilder idade(int nome){
        this.idade = idade;
        return this;
    }

    public PessoaBuilder sexo(String sexo){
        this.sexo = sexo;
        return this;
    }

    public Pessoa build(){
        return new Pessoa(nome, idade, sexo);
    }
}
