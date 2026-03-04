import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setAluno("João Silva", "123.456.789-00", "Rua A, 123", "(11) 1234-5678");
        JOptionPane.showMessageDialog(null, aluno1.getAluno());
    }
}
