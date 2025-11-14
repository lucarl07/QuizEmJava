package classesquiz.perguntas;

import java.util.Scanner;

abstract class Pergunta implements Pontuavel {
    protected String enunciado;
    protected char respostaCorreta;
    protected char respostaJogador;
    protected boolean isRespostaJogadorCorreta;
    protected int pontuacao;

    public Pergunta(String enunciado, char respostaCorreta) {
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
    }

    public void fazerPergunta() {
        System.out.println(enunciado);

        Scanner scanner = new Scanner(System.in);
        respostaJogador = scanner.nextLine().charAt(0);
        verificarResposta();
        scanner.close();
    }
    public void verificarResposta() {
        isRespostaJogadorCorreta = respostaCorreta == respostaJogador;
    }
    public int calcularPontuacao() {
        return 0;
    }
}
