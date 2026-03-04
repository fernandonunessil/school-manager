import java.util.List;
import java.util.ArrayList;

// --- Estrutura das Classes ---

class Aluno {
    String nome;
    int matricula;
    String curso;
}

class Professor {
    String nome;
    String departamento;
    String titulacao;
}

class Turma {
    String codigo;
    String disciplina;
    Professor professor;
    List<Aluno> listaAlunos = new ArrayList<>();
}

// --- Classe Principal (Executável) ---

public class SistemaEscolar {
    public static void main(String[] args) {
        // As classes acima já podem ser instanciadas aqui
        System.out.println("Estrutura de classes Aluno, Professor e Turma pronta!");
    }
}