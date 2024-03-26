package org.example;

import org.example.exception.DataInvalidaException;
import org.example.model.Ator;
import org.example.model.Diretor;
import org.example.model.Filme;
import org.example.util.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadastroFilmeService {

    public static void cadastrarFilme(Menu menu, List<Filme> filmesCadastrados) throws DataInvalidaException {
        System.out.println("Cadastro de Filme");

        System.out.print("Nome do filme: ");
        String nome = menu.lerString();

        System.out.print("Diretor: ");
        String nomeDiretor = menu.lerString();
        Diretor diretor = new Diretor(nomeDiretor);

        List<Ator> atores = new ArrayList<>();
        System.out.print("Quantidade de atores: ");
        int quantidadeAtores = menu.lerInt();


        for (int i = 0; i < quantidadeAtores; i++) {
            System.out.print("Nome do ator " + (i + 1) + ": ");
            String nomeAtor = menu.lerString();
            atores.add(new Ator(nomeAtor));
        }

        System.out.print("Informações de filmagem: ");
        String infoFilmagem = menu.lerString();

        System.out.print("Endereço de gravação: ");
        String enderecoGravacao = menu.lerString();


        System.out.print("Data de início (dd/mm/aaaa): ");
        LocalDate dataInicio = menu.lerData();

        System.out.print("Data de fim (dd/mm/aaaa): ");
        LocalDate dataFim = menu.lerData();

        if (dataInicio.isAfter(dataFim)) {
            throw new DataInvalidaException("Data de início não pode ser posterior à data de término.");
        }

        Filme filme = new Filme(nome, diretor, atores, infoFilmagem, enderecoGravacao, dataInicio, dataFim);
        filmesCadastrados.add(filme);
        System.out.println("Filme cadastrado com sucesso:");
        System.out.println(filme);
    }
}

