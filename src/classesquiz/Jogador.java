package classesquiz;

import java.util.Scanner;

public class Jogador {
    private String nome = "";
    private final Scanner scanner = new Scanner(System.in);

    public Jogador() {
        this.nome = scanner.nextLine();
        scanner.close();
    }
    public void editNome() {
        this.nome = scanner.nextLine();
    }
    public String getNome() {
        return nome;
    }
}
