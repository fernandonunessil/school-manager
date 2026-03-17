import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Acoes {
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    
    public void executarAcao(int acao) {
        switch (acao) {
            case 0:
                // Falta adicionar professor na turma, criar metodo de verificacao se o professor existe, e adicionar o professor na turma
                String codTurma = JOptionPane.showInputDialog(null, "Digite o código da turma:");
                // String etapa = JOptionPane.showInputDialog(null, "Digite a etapa da turma (INFANTIL, FUNDAMENTAL_ANOS_INICIAIS, FUNDAMENTAL_ANOS_FINAIS, MEDIO):");
                String etapa = (String) JOptionPane.showInputDialog(null, "Escolha a etapa da turma:", "Etapa", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"INFANTIL", "FUNDAMENTAL_ANOS_INICIAIS", "FUNDAMENTAL_ANOS_FINAIS", "MEDIO"}, "INFANTIL");
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano da turma:"));
                EtapaDescricaoEnum etapaEnum = EtapaDescricaoEnum.valueOf(etapa);
                Turma turma = new Turma(codTurma, etapaEnum, ano);
                turmas.add(turma);
                JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
                break;
            case 1:
                String nomeProfessor = JOptionPane.showInputDialog(null, "Digite o nome do professor:");
                String departamentoProfessor = JOptionPane.showInputDialog(null, "Digite o departamento do professor:");
                String titulacaoProfessor = (String) JOptionPane.showInputDialog(null, "Escolha a titulação do professor:", "Titulação", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"ESPECIALIZACAO", "MESTRADO", "DOUTORADO"}, "ESPECIALIZACAO");
                Professor professor = new Professor(nomeProfessor, departamentoProfessor, titulacaoProfessor);
                professores.add(professor);
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Cadastrar aluno");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Adicionar aluno a turma");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Remover aluno da turma");
                break;
            case 5: 
                JOptionPane.showMessageDialog(null, turmas.toString());
                break;
            case 6: 
                JOptionPane.showMessageDialog(null, professores.toString());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
