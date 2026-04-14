# 🏫 Projeto Integrador - Sistema de Gestão Escolar (Etapa 1 e 2)

Este é um sistema computacional interativo via console, desenvolvido como parte do Projeto Integrador. O objetivo principal é aplicar os conceitos de **Programação Orientada a Objetos (POO)**, **Estruturas de Dados** e **Tratamento de Exceções**, construindo uma ferramenta para apoiar a organização e gestão de uma escola.

---

## 📄 Relatório de Desenvolvimento

### 🔹 Etapa 1

### 1. Organização do Grupo e Metodologia

Para garantir uma entrega de qualidade e simular um ambiente de desenvolvimento real, adotamos uma abordagem colaborativa:

- **Repositório Compartilhado:** Utilização do GitHub para centralizar o projeto e acompanhar o progresso.
- **Divisão de Tarefas:** O sistema foi dividido em módulos, com cada integrante responsável por uma parte.
- **Pull Requests (PRs):** Todo código foi revisado antes de entrar na branch principal, garantindo qualidade e padronização.

---

### 2. Dificuldades Encontradas

- Cálculo preciso da idade considerando datas completas.
- Implementação da estrutura `ListaDeAlunos` do zero.
- Criação de algoritmo de ordenação para listagem alfabética.
- Aplicação de validações sem comprometer a organização do código.

---

### 3. Soluções e Arquitetura

- Uso de `LocalDate` e `Period` para cálculo correto de idade.
- Criação de `Enum` para padronizar etapas de ensino.
- Classe `FaixaEtaria` para centralizar regras de idade.
- Implementação de ordenação com algoritmo manual.
- Encapsulamento das regras dentro das próprias classes.

---

## 🔹 Etapa 2

### 1. Sobrescrita de Métodos

Foram sobrescritos os métodos `toString()` e `equals()` nas classes **Aluno** e **Turma**:

- **toString():**
  - Passa a retornar uma representação clara do objeto.
  - Facilita a exibição de dados no sistema.

- **equals():**
  - Permite comparar objetos com base em seus atributos.
  - Utilizado para verificar igualdade lógica entre alunos e turmas.

---

### 2. Tratamento de Exceções

Foi implementado tratamento de exceções para garantir maior robustez:

- Criação da exceção personalizada:
  - `ExcecaoDeAlunoJaExistente`

- Regra:
  - Ao tentar inserir um aluno duplicado, a exceção é lançada.

- Aplicação:
  - Uso de blocos `try-catch` para tratamento seguro de erros.

---

## ⚙️ Funcionalidades

- Cadastro de alunos
- Cadastro de turmas
- Matrícula de alunos
- Validação de limite de vagas
- Listagem de alunos em ordem alfabética
- Listagem de turmas e alunos matriculados
- Relatórios de inconsistência de faixa etária

---

## 🧠 Considerações Finais

O desenvolvimento deste projeto permitiu consolidar, na prática, conceitos fundamentais da programação orientada a objetos.

Na primeira etapa, o foco foi estruturar o sistema, organizar as classes e implementar regras de negócio de forma consistente. Já na segunda etapa, houve um avanço significativo na qualidade do software, com a introdução de sobrescrita de métodos e tratamento de exceções.

A sobrescrita do método `toString()` melhorou a forma de apresentação dos dados, enquanto o método `equals()` possibilitou comparações mais precisas entre objetos, sendo essencial para validações como a verificação de duplicidade de alunos.

A implementação da exceção `ExcecaoDeAlunoJaExistente` aumentou a robustez do sistema, permitindo tratar erros de forma controlada e evitando inconsistências nos dados.

As principais dificuldades encontradas foram:
- Implementar corretamente o método `equals()`.
- Definir onde lançar e tratar exceções.
- Integrar as novas funcionalidades sem quebrar a estrutura existente.

De forma geral, o projeto contribuiu para o desenvolvimento de boas práticas como encapsulamento, organização de código, reutilização e tratamento de erros, além de simular um ambiente real de desenvolvimento com versionamento e trabalho em equipe.

---

## 🚀 Tecnologias

- Linguagem: Java  
- Paradigma: Programação Orientada a Objetos  
- Interface: Console  

---

## ▶️ Como Executar

1. Clone o repositório: git clone https://github.com/fernandonunessil/school-manager.git


2. Abra na sua IDE (NetBeans, IntelliJ, Eclipse, etc.)

3. Execute a classe `Main.java`

---

## 👨‍💻 Desenvolvido por

- Felipe Bock Magagnin  
- Neytan Belisário  
- Karen Novaes Domschke  
- Fernando Nunes da Silva  