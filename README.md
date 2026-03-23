# 🏫 Projeto Integrador - Sistema de Gestão Escolar (Etapa 1)

Este é um sistema computacional interativo via console, desenvolvido como parte da primeira etapa do Projeto Integrador. O objetivo principal é aplicar os conceitos de **Programação Orientada a Objetos (POO)** e **Estruturas de Dados** na construção de uma ferramenta para apoiar a organização e gestão de uma escola.

---

## 📄 Relatório de Desenvolvimento (Etapa 1)


### 1. Como o grupo se organizou e Metodologia de Trabalho

Para garantir uma entrega de qualidade e simular um ambiente de mercado real, adotamos uma abordagem colaborativa fortemente baseada em controle de versão:

* **Repositório Compartilhado:** Centralizamos o projeto no GitHub, com acesso para todos os membros da equipe, garantindo transparência e acompanhamento do progresso em tempo real.

* **Divisão de Tarefas:** O escopo do projeto foi modularizado. Cada integrante ficou responsável por programar uma funcionalidade específica.

* **Fluxo de Pull Requests (PRs):** Estabelecemos a regra de que nenhum código iria direto para a *branch* principal (`main`). Cada desenvolvedor trabalhou em *branches* isoladas. Após finalizar a tarefa, o responsável abria um *Pull Request*, e o código só era integrado ao projeto principal após a revisão e aprovação dos demais membros. Isso evitou conflitos estruturais e garantiu a aderência ao modelo de objetos.


### 2. Dificuldades Encontradas
Durante a implementação, lidamos com desafios lógicos e estruturais, destacando-se:
* **Cálculo Dinâmico e Preciso da Idade:** Subtrair apenas o ano de nascimento do ano atual gera inconsistências. Precisávamos de uma forma de calcular a idade exata considerando meses, dias e anos bissextos para enquadrar o aluno na etapa correta.
* **Implementação da `ListaDeAlunos`:** Construir uma estrutura de dados do zero foi o maior desafio. O método `ordenar()` exigiu a criação de um algoritmo de ordenação manual para classificar os alunos em ordem alfabética sem corromper a estrutura.
* **Validações e Exceções:** Garantir a integridade dos dados (como impedir que uma turma ultrapasse o limite de vagas) sem poluir a interface do usuário com regras de negócio.


### 3. Soluções Propostas e Arquitetura

* **Manipulação de Datas (Java API):** Utilizamos as classes nativas `java.time.LocalDate` e `java.time.Period`. O cálculo exato foi resolvido encapsulando a lógica com `Period.between(nascimento, dataAtual).getYears()`, garantindo 100% de precisão na idade.
* **Boas Práticas de POO (Enums e Responsabilidade Única):** Para evitar erros de digitação e padronizar o sistema, criamos o `EtapaDescricaoEnum` (Infantil, Fundamental, Médio). Além disso, criamos uma classe dedicada `FaixaEtaria` com a única responsabilidade de converter a idade inteira para a etapa correspondente do Enum.
* **Encapsulamento de Regras de Negócio:** As validações foram inseridas dentro das próprias entidades. Por exemplo, a classe `Turma` gerencia sua própria lista (`ArrayList` nativo) e lança uma `Exception` customizada caso tente matricular um aluno além do limite de vagas, protegendo a integridade da memória.
* **Ordenação Customizada:** Na classe `ListaDeAlunos`, implementamos o algoritmo [INSERIR AQUI QUAL SORT VOCÊS USARAM: ex: Bubble Sort / Insertion Sort] utilizando o método `compareTo` das Strings para ordenar os nomes alfabeticamente.

## ⚙️ Funcionalidades do Sistema

O sistema roda inteiramente na memória e possui as seguintes funcionalidades acessíveis via console:
* **Cadastro de Alunos:** Inserção de nome, CPF, endereço e data de nascimento.
* **Cadastro de Turmas:** Registro informando código, etapa de ensino, ano e limite de vagas.
* **Matrícula:** Inclusão de um aluno em uma turma específica (com validação de vagas e emissão de alertas de faixa etária).
* **Consultas:**
  * Listagem de alunos da escola em **ordem alfabética**.
  * Listagem de turmas e alunos matriculados por turma.
  * Relatório de alunos matriculados em uma etapa fora da faixa de idade prevista.

  ## 🚀 Tecnologias e Execução

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos
* **Interface:** Console / Terminal

**Como executar localmente:**
1. Clone o repositório: `git clone https://github.com/fernandonunessil/school-manager.git`
2. Abra o projeto na sua IDE de preferência.
3. Execute a classe principal (`Main.java`) e interaja com o menu pelo Console..

---
**Desenvolvido por:**
* Felipe Bock Magagnin
* Neytan Belisário
* Karen Novaes Domschke
* Fernando Nunes da Silva