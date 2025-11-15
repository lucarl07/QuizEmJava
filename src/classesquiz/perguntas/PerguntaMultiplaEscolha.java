package classesquiz.perguntas;

public class PerguntaMultiplaEscolha extends Pergunta {
    int pontuacao = 10;

    public PerguntaMultiplaEscolha(String enunciado, char respostaCorreta) {
        super(enunciado, respostaCorreta);
    }

    @Override
    public int calcularPontuacao() {
        // Jogador pode ganhar 10 pontos caso acertar;
        if (isRespostaJogadorCorreta) {
            pontuacao = 10;
        }
        return pontuacao;
    }
}
