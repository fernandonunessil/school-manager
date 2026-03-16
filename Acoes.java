import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Acoes {
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    
    public void executarAcao(int acao) {
        switch (acao) {
            case 0:
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
                JOptionPane.showMessageDialog(null, "Cadastrar professor");
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
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
