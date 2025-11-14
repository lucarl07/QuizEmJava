package classesquiz.perguntas;

public class PerguntaVerdadeiroFalso extends Pergunta {
    int pontuacao = 15;

    public PerguntaVerdadeiroFalso(String enunciado, char respostaCorreta) {
        super(enunciado, respostaCorreta);
    }

    @Override
    public int calcularPontuacao() {
        // Jogador ganha 15 pontos caso acertar, ou perde 5 caso errar;
        if (isRespostaJogadorCorreta) {
            return pontuacao;
        }
        return -5;
    }
}
