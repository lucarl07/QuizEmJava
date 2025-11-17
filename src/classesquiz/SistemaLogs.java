package classesquiz;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaLogs {
    private static String[] eventosPadrao = {
      "Programa iniciado.",
      "Programa finalizado subitamente",
      "Programa finalizado com êxito.",
      "Quiz \"%s\" iniciado.",
      "Quiz \"%s\" finalizado subitamente.",
      "Quiz \"%s\" finalizado com êxito."
    };
    private static String formatoMsg = "[LOG] %s - %s %n";
    
    private String obterStringHoraEvento() {
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
      return LocalTime.now().format(formatador);
    }
    public void registrarEvento(int tipoEventoPadrao, String variavel) {
        String evento = eventosPadrao[tipoEventoPadrao];
        if (tipoEventoPadrao > 3) {
            evento = String.format(evento, variavel);
        }
        System.out.printf(formatoMsg, obterStringHoraEvento(), evento);
    }
    public void registrarEvento(int tipoEventoPadrao) {
        System.out.printf(
            formatoMsg,
            obterStringHoraEvento(), eventosPadrao[tipoEventoPadrao]
        );
    }
    public void registrarEvento(String mensagem) {
        System.out.printf(
          formatoMsg,
          obterStringHoraEvento(), mensagem
        );
    }
}
