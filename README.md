Projeto Biblioteca — Avaliação Somativa RA3
Descrição
Este projeto consiste na implementação de um sistema de gerenciamento básico de uma biblioteca, com foco no mapeamento objeto-relacional (ORM), utilizando Java Persistence API (JPA) com o provedor EclipseLink, conforme a especificação da Avaliação Somativa RA3.

O projeto implementa sete entidades persistentes, cada uma com seu respectivo CRUD (Create, Read, Update, Delete).

Tecnologias Utilizadas
Java 17

Maven

JPA 2.2

EclipseLink 2.7.9

Banco de dados H2 (em memória)

Estrutura do Projeto
O projeto contém as seguintes entidades:

Livro

Autor

Editora

Categoria

Cliente

Emprestimo

Funcionario

Cada entidade possui um DAO (Data Access Object) correspondente, com implementação completa das operações de CRUD.

Além disso, a classe App.java demonstra o uso dos DAOs e executa operações de teste para cada uma das entidades.

Diagrama de Classes
O diagrama de classes está disponibilizado no relatório entregue no Canvas.

Reflexão sobre as maiores dificuldades
Durante o desenvolvimento do projeto, as principais dificuldades encontradas foram:

Configuração inicial do JPA com EclipseLink: foi necessário compreender corretamente como estruturar o persistence.xml, garantindo o mapeamento das entidades e a correta criação das tabelas no banco de dados.

Estruturação dos DAOs: outro desafio foi implementar um padrão consistente para os DAOs, que permitisse realizar as operações de CRUD de forma padronizada e reutilizável.

Relacionamentos entre entidades: configurar corretamente os relacionamentos @ManyToOne, especialmente na entidade Emprestimo, exigiu atenção para garantir que as chaves estrangeiras fossem criadas e populadas corretamente.

Teste completo: validar as operações de CRUD para todas as entidades, garantindo que o fluxo de persistência e recuperação de dados estivesse funcional.

No final, a execução completa do projeto no console confirmou que todas as funcionalidades foram implementadas com sucesso.

Como executar
Clone o repositório do GitHub.

Importe o projeto como um projeto Maven no IntelliJ IDEA.

Rode a classe main.App para executar os testes de CRUD.

Observe no console a criação das tabelas e a execução das operações.

Projeto desenvolvido para a disciplina de Engenharia de Software, Avaliação Somativa RA3.