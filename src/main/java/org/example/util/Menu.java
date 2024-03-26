package org.example.util;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public String lerString() {
        return scanner.nextLine();
    }

    public int lerInt() {
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }


    public LocalDate lerDataInicio() {
        System.out.println("Digite a data de início (dd/mm/aaaa): ");
        return lerData();
    }

    public LocalDate lerDataTermino() {
        System.out.println("Digite a data de término (dd/mm/aaaa): ");
        return lerData();
    }

    public LocalDate lerData() {
        String dataString = scanner.nextLine();
        String[] partes = dataString.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        return LocalDate.of(ano, mes, dia);
    }

    public void limparBuffer() {
        scanner.nextLine(); // Limpa o buffer de entrada
    }
}


