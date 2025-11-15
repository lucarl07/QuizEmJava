package classesquiz.perguntas;

public class PerguntaVerdadeiroFalso extends Pergunta {
    public PerguntaVerdadeiroFalso(String enunciado, char respostaCorreta) {
        super(enunciado, respostaCorreta);
    }

    @Override
    public void verificarResposta() {
        super.verificarResposta();
        String strRespostaCorreta = respostaCorreta == 'V' ? "verdadeira" : "falsa";

        if (isRespostaJogadorCorreta) {
            System.out.printf(
                "Você acertou! A afirmação \"%s\" é %s. %n",
                this.enunciado, strRespostaCorreta
            );
        } else {
            System.out.printf(
                "Infelizmente sua resposta está errada. A afirmação \"%s\" é %s. %n",
                this.enunciado, strRespostaCorreta
            );
        }
    }

    @Override
    public int calcularPontuacao() {
        // Jogador ganha 15 pontos caso acertar, ou perde 5 caso errar;
        if (isRespostaJogadorCorreta) {
            pontuacao = 15;
        } else {
            pontuacao = -5;
        }
        return pontuacao;
    }
}
