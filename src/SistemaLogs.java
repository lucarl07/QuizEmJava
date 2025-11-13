import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaLogs {
    protected int quantidadeEventos = 0;

    void registrarEvento(String mensagem) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss.SSSS");
        String horaEvento = LocalTime.now().format(formatador);

        System.out.printf("[%s] %s", horaEvento, mensagem);
    }
}
