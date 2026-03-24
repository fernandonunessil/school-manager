import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Acoes sistema = new Acoes();

        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de gerenciamento");

        int acaoEscolhida;
        boolean exit = false;

        while (!exit) {

            acaoEscolhida = JOptionPane.showOptionDialog(
                    null,
                    "O que deseja fazer?\n\n"
                            + "1 - Cadastrar turma\n"
                            + "2 - Cadastrar aluno\n"
                            + "3 - Mostrar turmas cadastradas\n"
                            + "4 - Mostrar alunos cadastrados\n"
                            + "5 - Mostrar alunos de uma turma\n"
                            + "6 - Mostrar alunos fora da idade prevista\n"
                            + "7 - Sair",
                    "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[] { "1", "2", "3", "4", "5", "6", "7" },
                    "1");

            if (acaoEscolhida == 6) {
                JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                exit = true;
                break;
            }

            sistema.executarAcao(acaoEscolhida);
        }
    }
}