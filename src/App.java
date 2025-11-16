import classesquiz.Jogador;
import classesquiz.Quiz;
import classesquiz.SistemaLogs;
import classesquiz.perguntas.Pergunta;
import classesquiz.perguntas.PerguntaMultiplaEscolha;
import classesquiz.perguntas.PerguntaVerdadeiroFalso;

public class App {
    public static Quiz obterQuizTeste() {
        Quiz quizTeste = new Quiz("Quiz de Teste");
        Pergunta[] perguntas = {
                new PerguntaVerdadeiroFalso("O ovo veio primeiro que a galinha.", 'V'),
                new PerguntaMultiplaEscolha(
                        "Em que ano o Brasil declarou sua independência de Portugal?",
                        new String[]{"1889", "1921", "1822", "1824", "1964"},
                        'C'
                )
        };
        quizTeste.setPerguntas(perguntas);
        return quizTeste;
    }

    public static void main(String[] args) {
        SistemaLogs appLog = new SistemaLogs();
        appLog.registrarEvento("Programa iniciado");

        // Introdução ao quiz:
        System.out.println("=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=");
        System.out.println("=:  Seja bem-vindo(a) ao...  :=");
        System.out.println("=:       QUIZ EM JAVA!       :=");
        System.out.println("=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=");

        // Instanciando a classe classesquiz.Jogador
        System.out.println("Qual é o seu nome, jogador(a)?");
        Jogador jogador = new Jogador();
        appLog.registrarEvento(String.format("classesquiz.Jogador \"%s\" criado com êxito", jogador.getNome()));
        System.out.println("Seja-bem vindo(a), " + jogador.getNome() + "!");

        // Iniciando o quiz de teste
        System.out.println("Iniciando o quiz agora...");
        Quiz quizTeste = obterQuizTeste();
        quizTeste.executar();
    }
}