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

![](docs/screenshots/encapsulamento.png)

*Classe Alternativa, na qual seus atributos são privados e acessados apenas por getters*

### Herança:
> As classes PerguntaVerdadeiroFalso e PerguntaMultiplaEscolha herdam de Pergunta.

![](docs/screenshots/heranca_1.png)
![](docs/screenshots/heranca_2.png)

*Extensão de Pergunta pelas subclasses PerguntaMultiplaEscolha e PerguntaVerdadeiroFalso*

### Polimorfismo:
> A lista de perguntas deve ser do tipo Pergunta, armazenando diferentes subclasses.

![](docs/screenshots/polimorfismo.png)

*O atributo "perguntas" armazena tanto perguntas de verdadeiro e falso, quanto perguntas de múltipla escolha.*

### Abstração:
> A classe Pergunta deve ser abstrata.

![](docs/screenshots/abstracao.png)

### Interface:
> Pontuavel define o método calcularPontuacao.

![](docs/screenshots/interface.png)

### Sobrescrita:
> Nas subclasses de Pergunta (**obrigatório:** método verificarResposta).

![Sobrescrita na subclasse PerguntaMultiplaEscolha](docs/screenshots/sobrescrita_1.png)

![Sobrescrita na subclasse PerguntaVerdadeiroFalso](docs/screenshots/sobrescrita_2.png)

*Sobrescrita nas subclasses PerguntaMultiplaEscolha e PerguntaVerdadeiroFalso*

Além de sobrescrever o método `verificarResposta()` em ambas as subclasses de `Pergunta`, os métodos `fazerPergunta()` e
`calcularPontuacao()` também foram sobrescritos, esse último nas duas classes-filha.

### Sobrecarga:
> Na classe SistemaLogs (**obrigatório:** método registrarEvento).

![](docs/screenshots/sobrecarga.png)

*Três métodos "registrarEvento" com diferentes assinaturas*

### Construtores com super():
> Nas subclasses de Pergunta.
 
![Função construtora de PerguntaMultiplaEscolha, com a função super()](docs/screenshots/construtor_super_1.png)

![Função construtora de PerguntaVerdadeiroFalso, com a função super()](docs/screenshots/construtor_super_2.png)

*Função construtora das subclasses de Pergunta, com a função super()*

### Atributos e métodos estáticos:
> Na classe Quiz.

![](docs/screenshots/att_met_estaticos.png)

*Atributo e método estático na classe Quiz*

Aqui também é possível ver um exemplo de **composição**: o atributo `perguntas` é uma array de instâncias da classe 
`Pergunta`.

### Modificadores:
> Uso dos modificadores `private`, `public` e `protected`.

![Uso do modificador "protected"](docs/screenshots/modificadores.png)

*Uso do modificador "protected", que não foi exibido nas imagens anteriores*