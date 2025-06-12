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
Durante o desenvolvimento do projeto, a principal dificuldade foi entender como configurar corretamente o JPA com o EclipseLink, especialmente o persistence.xml, para garantir que as entidades fossem mapeadas e o banco fosse gerado corretamente.

Outra parte que exigiu atenção foi criar os DAOs e garantir que o CRUD funcionasse bem para cada entidade. Além disso, configurar os relacionamentos entre as tabelas (como no caso do Emprestimo) foi um bom aprendizado.

No geral, o projeto ajudou muito a fixar o conceito de ORM e como ele facilita o trabalho com banco de dados no Java.

Como executar
Clone o repositório do GitHub.

Importe o projeto como um projeto Maven no IntelliJ IDEA.

Rode a classe main.App para executar os testes de CRUD.

Observe no console a criação das tabelas e a execução das operações.

Projeto desenvolvido para a disciplina de Engenharia de Software, Avaliação Somativa RA3.