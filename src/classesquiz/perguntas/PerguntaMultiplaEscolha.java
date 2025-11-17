package classesquiz.perguntas;

public class PerguntaMultiplaEscolha extends Pergunta {
    Alternativa[] alternativas;

    public PerguntaMultiplaEscolha(String enunciado, String[] strAlternativas, char respostaCorreta) {
        char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Alternativa[] alternativas = new Alternativa[strAlternativas.length];

        for (int i = 0; i < strAlternativas.length; i++) {
            alternativas[i] = new Alternativa(alfabeto[i], strAlternativas[i]);
        }

        this.alternativas = alternativas;
        super(enunciado, respostaCorreta);
    }

    @Override
    public void fazerPergunta(int numPergunta) {
        System.out.printf("%s - %s %n", numPergunta, enunciado);

        for (Alternativa a : alternativas) {
            System.out.printf(
                "%s) %s %n",
                a.getLetra(), a.getResposta()
            );
        }

        super.obterRespostaJogador();
        this.verificarResposta();
    }

    @Override
    public void verificarResposta() {
        super.verificarResposta();

        for (Alternativa a : alternativas) {
            if (a.getLetra() == respostaCorreta) {
                if (isRespostaJogadorCorreta) {
                    System.out.printf(
                        "Você acertou! A alternativa correta é a alternativa %s: %s. %n",
                        a.getLetra(), a.getResposta()
                    );
                } else {
                    System.out.printf(
                        "Infelizmente você errou. A alternativa correta é a alternativa %s: %s. %n",
                        a.getLetra(), a.getResposta()
                    );
                }
                break;
            }
        }
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
