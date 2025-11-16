package classesquiz.perguntas;

import java.util.Scanner;

public abstract class Pergunta implements Pontuavel {
    protected String enunciado;
    protected char respostaCorreta;
    protected char respostaJogador;
    protected boolean isRespostaJogadorCorreta;
    protected int pontuacao = 0;

    public Pergunta(String enunciado, char respostaCorreta) {
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
    }

    public void fazerPergunta(int numPergunta) {
        System.out.printf("%s - %s %n", numPergunta, enunciado);
        obterRespostaJogador();
        verificarResposta();
    }
    public void obterRespostaJogador() {
        Scanner scanner = new Scanner(System.in);
        respostaJogador = scanner.nextLine().charAt(0);
    }
    public void verificarResposta() {
        isRespostaJogadorCorreta = respostaCorreta == respostaJogador;
    }
    public boolean isRespostaJogadorCorreta() {
        return isRespostaJogadorCorreta;
    }
    public int calcularPontuacao() {
        return 0;
    }
}
