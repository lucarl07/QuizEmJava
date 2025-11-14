package classesquiz;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaLogs {
    protected int quantidadeEventos = 0;

    public void registrarEvento(String mensagem) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaEvento = LocalTime.now().format(formatador);

        System.out.printf("[LOG] %s - %s %n", horaEvento, mensagem);
    }
}
