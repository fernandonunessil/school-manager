import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Aluno {
    private String nome;
    private String cpf;
    private String endereco;
    private String nascimento;

    public Aluno(String nome, String cpf, String endereco, String nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public String getAluno() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Endereço: " + endereco + "\n" +
                "Nascimento: " + nascimento;
    }

    public int getIdadeAluno() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(nascimento, formatter);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public FaixaEtaria getFaixaEtariaAluno() throws Exception {
        return new FaixaEtaria(this.getIdadeAluno());
    }

    public void excluirAluno() {
        this.nome = null;
        this.cpf = null;
        this.endereco = null;
        this.nascimento = null;
    }
}
