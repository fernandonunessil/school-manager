// import java.util.List;
// import java.util.ArrayList;

// --- Estrutura das Classes ---

public class Aluno {
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

// class Professor {
//     String nome;
//     String departamento;
//     String titulacao;
// }

// class Turma {
//     String codigo;
//     String disciplina;
//     Professor professor;
//     List<Aluno> listaAlunos = new ArrayList<>();
// }

// --- Classe Principal (Executável) ---

// public class SistemaEscolar {
//     public static void main(String[] args) {
//         // As classes acima já podem ser instanciadas aqui
//         System.out.println("Estrutura de classes Aluno, Professor e Turma pronta!");
//     }
// }