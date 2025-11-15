package classesquiz.perguntas;

class Alternativa {
    private char letra;
    private String resposta;

    Alternativa(char letra, String resposta) {
        this.letra = letra;
        this.resposta = resposta;
    }

    public char getLetra() {
        return letra;
    }
    public String getResposta() {
        return resposta;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}

public class PerguntaMultiplaEscolha extends Pergunta {
    Alternativa[] alternativas;

    public PerguntaMultiplaEscolha(String enunciado, Alternativa[] alternativas, char respostaCorreta) {
        this.alternativas = alternativas;
        super(enunciado, respostaCorreta);
    }

    @Override
    public void fazerPergunta() {
        System.out.println(enunciado);

        for (Alternativa a : alternativas) {
            System.out.printf(
                "%s - %s %n",
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
