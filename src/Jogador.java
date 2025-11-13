import java.util.Scanner;

public class Jogador {
    private String nome = "";
    private final Scanner scanner = new Scanner(System.in);

    Jogador() {
        this.nome = scanner.nextLine();
    }
    void editNome() {
        this.nome = scanner.nextLine();
    }
    String getNome() {
        return nome;
    }
}
