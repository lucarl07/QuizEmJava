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
