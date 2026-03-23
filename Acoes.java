import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Acoes {
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    // private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void executarAcao(int acao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        switch (acao) {
            case 0:
                // Falta adicionar professor na turma, criar metodo de verificacao se o
                String codTurma = JOptionPane.showInputDialog(null, "Digite o código da turma:");

                String etapa = (String) JOptionPane.showInputDialog(null, "Escolha a etapa da turma:", "Etapa",
                        JOptionPane.QUESTION_MESSAGE, null,
                        new Object[] { "INFANTIL", "FUNDAMENTAL_ANOS_INICIAIS", "FUNDAMENTAL_ANOS_FINAIS", "MEDIO" },
                        "INFANTIL");
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano da turma:"));
                int limiteVagas = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Informe o limite de vagas dessa turma:"));
                EtapaDescricaoEnum etapaEnum = EtapaDescricaoEnum.valueOf(etapa);
                Turma turma = new Turma(codTurma, etapaEnum, ano, limiteVagas);
                turmas.add(turma);
                JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
                break;
            case 1:

                if (turmas.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Não é possível cadastrar um aluno pois não existem turmas cadastradas.");
                    break;
                }

                String nomeAluno = JOptionPane.showInputDialog(null, "Nome do aluno:");
                String cpfAluno = JOptionPane.showInputDialog(null, "CPF:");
                String enderecoAluno = JOptionPane.showInputDialog(null, "Informe seu endereço:");

                LocalDate nascimentoAluno = null;
                while (nascimentoAluno == null) {
                    String input = JOptionPane.showInputDialog(null, "Digite a data de nascimento (DD/MM/AAAA):");
                    try {
                        nascimentoAluno = LocalDate.parse(input, formatter);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Informe uma data válida no formato DD/MM/AAAA.");
                    }
                }

                Aluno aluno = new Aluno(nomeAluno, cpfAluno, enderecoAluno, nascimentoAluno);

                String[] opcoesTurmas = turmas.stream()
                        .map(t -> t.toString().replace("\n", " | "))
                        .toArray(String[]::new);

                String turmaSelecionadaStr = (String) JOptionPane.showInputDialog(
                        null, "Selecione a turma para o aluno:", "Turmas disponíveis",
                        JOptionPane.QUESTION_MESSAGE, null, opcoesTurmas, opcoesTurmas[0]);

                if (turmaSelecionadaStr == null) {
                    JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
                    break;
                }

                int indexTurma = java.util.Arrays.asList(opcoesTurmas).indexOf(turmaSelecionadaStr);
                Turma turmaSelecionada = turmas.get(indexTurma);

                try {
                    turmaSelecionada.adicionarAluno(aluno);
                    alunos.add(aluno);
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado e matriculado com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao matricular: " + e.getMessage());
                }

                break;
            case 2:
                if (turmas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma turma cadastrada");
                    break;
                }
                JOptionPane.showMessageDialog(null, turmas.toString());
                break;
            case 3:
                if (alunos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma turma cadastrada");
                    break;
                }
                String orderALUNOS = (String) JOptionPane.showInputDialog(
                        null,
                        "Ordenar por (Nome) ou (Idade): ",
                        "Ordem:",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new String[] { "Nome", "Idade" },
                        "Nome");
                ArrayList<Aluno> listaOrdenada = new ArrayList<>(alunos);
                if (orderALUNOS.equals("Nome")) {
                    listaOrdenada.sort(java.util.Comparator.comparing(Aluno::getNome));
                } else {
                    listaOrdenada.sort(java.util.Comparator.comparing(Aluno::getIdade));
                }

                StringBuilder resultado = new StringBuilder();

                for (Aluno a : listaOrdenada) {
                    resultado.append(a.getNome())
                            .append(" - ")
                            .append(a.getIdade())
                            .append("\n");
                }

                JOptionPane.showMessageDialog(null, resultado.toString());
                break;
            case 4:
                if (turmas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma turma cadastrada");
                    break;
                }

                String[] opcoesTurmasLista = turmas.stream()
                        .map(t -> t.toString().replace("\n", " | "))
                        .toArray(String[]::new);

                String turmaEscolhida = (String) JOptionPane.showInputDialog(
                        null,
                        "Selecione a turma:",
                        "Turmas",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoesTurmasLista,
                        opcoesTurmasLista[0]);

                if (turmaEscolhida == null) {
                    break;
                }

                int index = java.util.Arrays.asList(opcoesTurmasLista).indexOf(turmaEscolhida);
                Turma turmaSelecionadaLista = turmas.get(index);

                if (turmaSelecionadaLista.getAlunos().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado nessa turma");
                } else {
                    StringBuilder lista = new StringBuilder();

                    lista.append("Alunos da turma:\n\n");

                    for (Aluno a : turmaSelecionadaLista.getAlunos()) {
                        lista.append(a.getAluno()) // você já criou esse método 👍
                                .append("\n-------------------\n");
                    }

                    JOptionPane.showMessageDialog(null, lista.toString());
                }

                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
