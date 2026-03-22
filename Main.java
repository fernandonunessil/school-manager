import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Aluno alunoDataNascimentoInvalida = new Aluno("João Silva", "123.456.789-00", "Rua A, 123", "09/09/1999");
        JOptionPane.showMessageDialog(null, alunoDataNascimentoInvalida.getAluno());

        Turma turmaA = new Turma("A", EtapaDescricaoEnum.INFANTIL, 2026);
        Professor professorTurmaA = new Professor("Maria Oliveira", "Pedagogia", "Especialização");
        turmaA.setProfessor(professorTurmaA);

        try {
            turmaA.adicionarAluno(alunoDataNascimentoInvalida);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            Aluno alunoInfantil = new Aluno("Criança da Silva", "123.456.789-00", "Rua A, 123", "01/01/2024");
            turmaA.adicionarAluno(alunoInfantil);

            JOptionPane.showMessageDialog(null,
                    "Aluno adicionado com sucesso, quantidade de alunos da turma: " + turmaA.getNumeroMatriculados());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
