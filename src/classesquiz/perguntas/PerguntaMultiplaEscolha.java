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
    public int calcularPontuacao() {
        // Jogador pode ganhar 10 pontos caso acertar;
        if (isRespostaJogadorCorreta) {
            pontuacao = 10;
        }
        return pontuacao;
    }
}
