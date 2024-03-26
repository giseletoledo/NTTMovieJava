package org.example.model;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDate;
import java.util.List;

public class Filme {
    private UUID id;
    private String nome;
    private Diretor diretor;
    private List<Ator> atores;
    private String infoFilmagem;
    private String enderecoGravacao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Filme(String nome, Diretor diretor, List<Ator> atores, String infoFilmagem, String enderecoGravacao, LocalDate dataInicio, LocalDate dataFim) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.diretor = diretor;
        this.atores = atores;
        this.infoFilmagem = infoFilmagem;
        this.enderecoGravacao = enderecoGravacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return new ArrayList<>(atores);
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }


    public static boolean isDataValida(String data) {
        try {
            LocalDate.parse(data);  // Attempt to parse the date
            return true;  // Date is valid, return true
        } catch (DateTimeParseException e) {
            return false;  // Date is invalid, return false
        }
    }


    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor=" + diretor +
                ", atores=" + atores +
                ", infoFilmagem='" + infoFilmagem + '\'' +
                ", enderecoGravacao='" + enderecoGravacao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}
