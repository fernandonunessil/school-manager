import java.time.LocalDate;
import java.time.Period;

class Aluno {
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate nascimento;

    public Aluno(String nome, String cpf, String endereco, LocalDate nascimento) {
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

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return java.time.Period.between(this.nascimento, java.time.LocalDate.now()).getYears();
    }

    public int getIdadeAluno() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(nascimento, dataAtual);
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
