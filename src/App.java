import classesquiz.Jogador;
import classesquiz.SistemaLogs;

public class App {
    public static void main(String[] args) {
        SistemaLogs log = new SistemaLogs();
        log.registrarEvento("Programa iniciado");

        // Introdução ao quiz:
        System.out.println("=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=");
        System.out.println("=:  Seja bem-vindo(a) ao...  :=");
        System.out.println("=:       QUIZ EM JAVA!       :=");
        System.out.println("=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=");

        // Instanciando a classe classesquiz.Jogador
        System.out.println("Qual é o seu nome, jogador(a)?");
        Jogador jogador = new Jogador();
        log.registrarEvento(String.format("classesquiz.Jogador \"%s\" criado com êxito", jogador.getNome()));
        System.out.println("Seja-bem vindo(a), " + jogador.getNome() + "!");
    }
}