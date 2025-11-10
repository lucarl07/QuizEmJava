# Fluxo do Programa

## Processos Iniciais
- Programa inicia (instância de App criada)
- Instância de App criada
- Instância de SistemaLogs criada
- **[SistemaLogs é acionado]**
- Sistema pergunta ao usuário qual o seu nome
- Instância de Jogador criada, com o nome fornecido pelo usuário

## Repetição - Perguntas
**[repete: min = 4]**
- Instância de uma subclasse de Pergunta criada
    - Pergunta é exibida no console
    - Input do jogador é solicitado
    - Objeto verifica se a alternativa foi a correta
    - Caso correta:
      - App pega a pontuação que esta questão vale, e incrementa nele
      - **[SistemaLogs é acionado]**
    - Caso incorreta
      - **[SistemaLogs é acionado]**

**[/repete]**

## Encerramento
- App é finalizado e pontuação do jogador é exibida
- Atributo estático "quizzesJogados" da classe App é incrementado
- **[SistemaLogs é acionado]**