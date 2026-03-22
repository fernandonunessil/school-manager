import java.util.ArrayList;
import java.util.List;

class Turma {
    private String codigo;
    private EtapaDescricaoEnum etapa;
    private int ano;
    private int limiteVagas;

    private Professor professor;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public Turma(String codigo, EtapaDescricaoEnum etapa, int ano) {
        this.codigo = codigo;
        this.etapa = etapa;
        this.ano = ano;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setLimiteVagas(int limiteVagas) {
        this.limiteVagas = limiteVagas;
    }

    public int getNumeroMatriculados() {
        return this.listaAlunos.size();
    }

    public String getAluno() {
        String nomeProfessor = this.professor == null ? "Não atribuído" : this.professor.getNome();

        return "Codigo " + codigo + "\n" +
                "Etapa: " + etapa + "\n" +
                "Ano: " + ano + "\n" +
                "Professor: " + nomeProfessor;
    }

    public void adicionarAluno(Aluno aluno) throws Exception {
        if (getNumeroMatriculados() >= this.limiteVagas + 1) {
            throw new Exception("A turma já possue todas as vagas preenchidas");
        }

        FaixaEtaria faixaEtaria = aluno.getFaixaEtariaAluno();

        if (etapa != faixaEtaria.descricao) {
            throw new Exception("O aluno não possui idade válida para participar dessa turma");
        }

        this.listaAlunos.add(aluno);
    }

    public void removerAluno(int index) {
        this.listaAlunos.remove(index);
    }
}