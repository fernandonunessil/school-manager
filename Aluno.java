// import java.util.List;
// import java.util.ArrayList;

// --- Estrutura das Classes ---

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;


    public void setAluno(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getAluno() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Endereço: " + endereco + "\n" +
                "Telefone: " + telefone;
    }

    public void excluirAluno() {
        this.nome = null;
        this.cpf = null;
        this.endereco = null;
        this.telefone = null;
    }

}

class Professor {
    private String nome;
    private String departamento;
    private String titulacao;
}

class Turma {
    private String codigo;
    private String disciplina;
    private Professor professor;
    private List<Aluno> listaAlunos = new ArrayList<>();
}

// --- Classe Principal (Executável) ---

// public class SistemaEscolar {
//     public static void main(String[] args) {
//         // As classes acima já podem ser instanciadas aqui
//         System.out.println("Estrutura de classes Aluno, Professor e Turma pronta!");
//     }
// }