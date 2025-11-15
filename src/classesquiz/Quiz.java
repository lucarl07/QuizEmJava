package classesquiz;

public class Quiz {
    // Atributos da classe:
    static int quizzesJogados = 0;

    // Atributos dos objetos:
    int pontuacao = 0;

    void adicionarPontuacao(int pontos) {
        pontuacao += pontos;
    }
}
