package classesquiz;

import classesquiz.perguntas.Pergunta;

public class Quiz {
    // Atributos da classe:
    private static int quizzesJogados = 0;

    // Atributos dos objetos:
    private String nome;
    private Pergunta[] perguntas;
    private int pontuacao = 0;

    public Quiz(String nome) {
        this.nome = nome;
    }
    private static void incrementarQuizzesJogados() {
        quizzesJogados += 1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPerguntas(Pergunta[] perguntas) {
        this.perguntas = perguntas;
    }
    public String getNome() {
        return nome;
    }
    private void adicionarPontuacao(int pontos) {
        pontuacao += pontos;
    }
    public void executar() {
        SistemaLogs quizLog = new SistemaLogs();
        quizLog.registrarEvento(3, nome);

        for (int i = 0; i < perguntas.length; i++) {
            Pergunta pergunta = perguntas[i];
            pergunta.fazerPergunta(i+1);

            int pontos = pergunta.calcularPontuacao();
            adicionarPontuacao(pontos);

            if (pergunta.isRespostaJogadorCorreta()) {
                quizLog.registrarEvento(
                        String.format("Pergunta %s respondida corretamente; +%s pontos.", i+1, pontos)
                );
            } else {
                quizLog.registrarEvento(
                        String.format("Pergunta %s respondida incorretamente; %s pontos.", i+1, pontos)
                );
            }
        }

        incrementarQuizzesJogados();
        System.out.printf(
                "Parabéns, você finalizou o quiz \"%s\"! \nPontuação adquirida: %s \nTotal de quizzes jogados: %s",
                nome, pontuacao, quizzesJogados
        );
        quizLog.registrarEvento(5, nome);
    }
}
