package org.example;

import org.example.exception.DataInvalidaException;
import org.example.model.Filme;
import org.example.util.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DataInvalidaException {
        Menu menu = new Menu();
        List<Filme> filmesCadastrados = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            CadastroFilmeService.cadastrarFilme(menu, filmesCadastrados);

            System.out.print("Deseja cadastrar outro filme? (S/N): ");
            String resposta = menu.lerString();
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        System.out.println("Filmes cadastrados:");
        for (Filme filme : filmesCadastrados) {
            System.out.println(filme);
        }
    }
}
