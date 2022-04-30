package base;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        nome = "não cadastrado";
        idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }
}