package org.example.model;

public class Ator extends Pessoa {

    public Ator() {
        super();
    }

    public Ator(String nome) {
        this.setNome(nome);
    }

    public Ator(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome" + getNome() +
                "idade=" + getIdade() +
                '}';
    }
}
