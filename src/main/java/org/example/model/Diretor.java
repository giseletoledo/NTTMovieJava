package org.example.model;

public class Diretor extends Pessoa {
    public Diretor(String nome, int idade) {
        super(nome, idade);
    }

    public Diretor() {
    }
    public Diretor(String nome) {
        this.setNome(nome);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }
}
