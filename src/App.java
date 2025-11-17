import classesquiz.Jogador;
import classesquiz.Quiz;
import classesquiz.SistemaLogs;
import classesquiz.perguntas.Pergunta;
import classesquiz.perguntas.PerguntaMultiplaEscolha;
import classesquiz.perguntas.PerguntaVerdadeiroFalso;

public class App {
    public static Quiz obterQuizHistoriaDoRock() {
        Quiz historiaDoRock = new Quiz("História do Rock");

        // Perguntas de verdadeiro e falso:
        PerguntaVerdadeiroFalso discoMaisVendido = new PerguntaVerdadeiroFalso(
                "O álbum \"Back in Black\", da banda AC/DC, é o disco de rock mais vendido da história, com cerca de 50 milhões de cópias vendidas.",
                'V'
        );
        PerguntaVerdadeiroFalso bandasBHMG = new PerguntaVerdadeiroFalso(
                "As bandas Sepultura, Legião Urbana e Pato Fu foram todas fundadas em Belo Horizonte, Minas Gerais.",
                'F'
        );
        PerguntaVerdadeiroFalso guitarristaNirvana = new PerguntaVerdadeiroFalso(
                "O guitarrista Kurt Ballou é mais conhecido pelo seu trabalho na banda Nirvana, pioneira no estilo Grunge dos anos 90.",
                'F'
        );
        PerguntaVerdadeiroFalso letraGitaRaulSeixas = new PerguntaVerdadeiroFalso(
                "A letra da música \"Gita\", do cantor-compositor baiano Raul Seixas, foi inspirada em um texto sagrado do hinduísmo, em que Arjuna pergunta a Krishna quem ele é.",
                'V'
        );

        // Perguntas de múltipla escolha:
        PerguntaMultiplaEscolha paiDoRock = new PerguntaMultiplaEscolha(
                "Qual músico é considerado o pai do Rock 'n' Roll por muitos, incluindo a revista Rolling Stone?",
                new String[]{"Mick Jagger", "Little Richard", "Chuck Schuldiner", "Elvis Presley", "Chuck Berry"},
                'E'
        );
        PerguntaMultiplaEscolha maeDoRock = new PerguntaMultiplaEscolha(
                "Antes do \"Pai do Rock\", houve uma cantora do mundo Gospel que tocava guitarras elétricas nas suas músicas. Qual o nome dela?",
                new String[]{"Aretha Franklin", "Rosetta Tharpe", "Patti Smith", "Mahalia Jackson", "Joan Jett"},
                'B'
        );
        PerguntaMultiplaEscolha primeiraBandaMetal = new PerguntaMultiplaEscolha(
                "Qual foi a primeira banda de Heavy Metal da história?",
                new String[]{"Iron Maiden", "Rush", "Black Sabbath", "Metallica", "Judas Priest"},
                'C'
        );
        PerguntaMultiplaEscolha bandaAnarchyUK = new PerguntaMultiplaEscolha(
                "Qual banda escreveu o clássico hino punk \"Anarchy In The UK\"?",
                new String[]{"Sex Pistols", "The Clash", "Talking Heads", "Pink Floyd", "Ramones"},
                'A'
        );

        historiaDoRock.setPerguntas(new Pergunta[]{
                discoMaisVendido, paiDoRock, bandasBHMG, maeDoRock,
                guitarristaNirvana, primeiraBandaMetal, letraGitaRaulSeixas, bandaAnarchyUK
        });
        return historiaDoRock;
    }

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

        // Iniciando o quiz "História do Rock"
        System.out.println("Iniciando o quiz agora...");
        Quiz quizHistoriaDoRock = obterQuizHistoriaDoRock();
        quizHistoriaDoRock.executar();
    }
}