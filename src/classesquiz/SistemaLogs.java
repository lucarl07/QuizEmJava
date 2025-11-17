package classesquiz;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaLogs {
    private static String[] tiposEventoPadrao = {
      "Programa iniciado.",
      "Programa finalizado subitamente",
      "Programa finalizado com êxito.",
      "Quiz iniciado",
      "Quiz finalizado subitamente.",
      "Quiz finalizado com êxito."
    };
    private static String formatoMsg = "[LOG] %s - %s %n";
    
    private String obterStringHoraEvento() {
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
      return LocalTime.now().format(formatador);
    }
    public void registrarEvento(int tipoEventoPadrao) {
        System.out.printf(
          formatoMsg, 
          obterStringHoraEvento(), tiposEventoPadrao[tipoEventoPadrao]
        );
    }
    public void registrarEvento(String mensagem) {
        System.out.printf(
          formatoMsg, 
          obterStringHoraEvento(), mensagem
        );
    }
}
