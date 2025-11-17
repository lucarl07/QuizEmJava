# Quiz em Java

## Introdução

Este repositório busca colocar em prática conceitos de Programação Orientada a Objetos (POO) através da
criação de um programa capaz de executar múltiplos quizzes.

Para executar a aplicação, execute a função estática `main` no arquivo `src/App.java`. Ele deve perguntar pelo
seu nome e, após isso, inicializar o quiz "História do Rock".

## Aplicação

Como os conceitos de POO foram aplicados?

### Encapsulamento:
> Todos os atributos devem ser privados com validação em setters.

A maioria dos atributos das classes neste projeto são privados, mas alguns - como os da classe abstrata 
Pergunta - foram necessários ter acesso de nível protegido (`protected`), possibilitando seu acesso de forma 
mais eficiente pelas suas subclasses.

### Herança:
> As classes PerguntaVerdadeiroFalso e PerguntaMultiplaEscolha herdam de Pergunta.

### Polimorfismo:
> A lista de perguntas deve ser do tipo Pergunta, armazenando diferentes subclasses.

### Abstração:
> A classe Pergunta deve ser abstrata.

### Interface:
> Pontuavel define o método calcularPontuacao.

### Sobrescrita:
> Nas subclasses de Pergunta (**obrigatório:** método verificarResposta).

### Sobrecarga:
> Na classe SistemaLogs (**obrigatório:** método registrarEvento).

### Construtores com super():
> Nas subclasses de Pergunta.

### Atributos e métodos estáticos:
> Em Quiz.

### Composição:
> Quiz possui perguntas e um jogador.

> Coesão e baixo acoplamento devem ser demonstrados e comentados.

### Modificadores:
> Uso dos modificadores `private`, `public` e `protected`.
