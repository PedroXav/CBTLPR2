# 📚 Projeto de Gestão de Livros, Autores e Pessoas

Este projeto é uma aplicação Java que contém três exercícios práticos desenvolvidos como parte da matéria **LINGUAGEM DE PROGRAMAÇÃO 2** do 4º semestre de 2024. O objetivo é modelar e manipular classes e objetos no contexto de livros, autores e pessoas.

## 🚀 Funcionalidades
O projeto está dividido em três exercícios principais:

### 1️⃣ Exercício 1: Classe `Author`
Neste exercício, foi criada a classe `Author`, que representa um autor com os atributos:
- **Nome**
- **Email**
- **Gênero (m ou f)**

A classe possui métodos públicos para acessar e manipular o email do autor, além de um método `toString()` que exibe as informações do autor de forma legível.

### 2️⃣ Exercício 2: Classe `Book`
O segundo exercício amplia o conceito do primeiro ao introduzir a classe `Book`, que representa um livro. Um livro pode ter múltiplos autores (objetos da classe `Author`), além de atributos como:
- **Nome do Livro**
- **Preço**
- **Quantidade em Estoque**

A classe `Book` possui métodos para retornar os nomes dos autores, atualizar o preço e a quantidade em estoque, além de um método `toString()` que exibe as informações detalhadas do livro e seus autores.

### 3️⃣ Exercício 3: Classes `Person`, `Staff` e `Student`
O terceiro exercício aborda herança em Java, com a criação das classes:
- **`Person`**: Classe base que representa uma pessoa com nome e endereço.
- **`Staff`**: Subclasse de `Person` que representa um membro da equipe, com atributos adicionais como escola e salário.
- **`Student`**: Subclasse de `Person` que representa um estudante, com atributos como programa, ano de estudo e taxa.

Essas classes demonstram o uso de herança para compartilhar e especializar comportamentos, além de contar com métodos `get`, `set` e `toString()` para manipulação e exibição de dados.

## 📑 Estrutura do Projeto

### Classes Principais
- **Author**: Representa um autor com nome, email e gênero.
- **Book**: Representa um livro com nome, lista de autores, preço e quantidade em estoque.
- **Person**: Representa uma pessoa com nome e endereço.
- **Staff**: Representa um membro da equipe escolar com atributos de escola e salário.
- **Student**: Representa um estudante com atributos de programa, ano e taxa.


