import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de gerenciamento");
        JOptionPane.showMessageDialog(null, "Oque deseja fazer ?");
        int acaoEscolhida = JOptionPane.showOptionDialog(null, "1 - Cadastrar turma\n2 - Cadastrar professor\n3 - Cadastrar aluno\n4 - Adicionar aluno a turma\n5 - Remover aluno da turma", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"1", "2", "3", "4", "5"}, "1");
        new Acoes(acaoEscolhida);






        // Aluno alunoDataNascimentoInvalida = new Aluno("João Silva", "123.456.789-00", "Rua A, 123", "09/09/1999");
        // JOptionPane.showMessageDialog(null, alunoDataNascimentoInvalida.getAluno());

        // Turma turmaA = new Turma("A", EtapaDescricaoEnum.INFANTIL, 2026);

        // try {
        //     turmaA.AdicionarAluno(alunoDataNascimentoInvalida);
        // } catch (Exception e) {
        //     JOptionPane.showMessageDialog(null, e.getMessage());
        // }

        // try {
        //     Aluno alunoInfantil = new Aluno("Criança da Silva", "123.456.789-00", "Rua A, 123", "01/01/2024");
        //     turmaA.AdicionarAluno(alunoInfantil);

        //     JOptionPane.showMessageDialog(null,
        //             "Aluno adicionado com sucesso, quantidade de alunos da turma: " + turmaA.getNumeroMatriculados());

        // } catch (Exception e) {
        //     JOptionPane.showMessageDialog(null, e.getMessage());
        // }
    }
}
