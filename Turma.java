class Turma {
    private String codigo;
    private EtapaDescricaoEnum etapa;
    private int ano;
    private int limiteVagas;

    private Professor professor;
    private ListaDeAlunos listaAlunos = new ListaDeAlunos();

    public Turma(String codigo, EtapaDescricaoEnum etapa, int ano, int limiteVagas) {
        this.codigo = codigo;
        this.etapa = etapa;
        this.ano = ano;
        this.limiteVagas = limiteVagas;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setLimiteVagas(int limiteVagas) {
        this.limiteVagas = limiteVagas;
    }

    public int getNumeroMatriculados() {
        return this.listaAlunos.tamanho();
    }

    public EtapaDescricaoEnum getEtapa() {
        return this.etapa;
    }

    public ListaDeAlunos getAlunos() {
        return listaAlunos;
    }

    public String getTurma() {
        return "Codigo " + codigo + "\n" +
                "Etapa: " + etapa + "\n" +
                "Ano: " + ano + "\n" +
                "Professor: " + (professor != null ? professor.getNome() : "Sem professor");
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void adicionarAluno(Aluno aluno) throws Exception {
        if (this.limiteVagas <= 0 || getNumeroMatriculados() >= this.limiteVagas) {
            throw new Exception("A turma já possue todas as vagas preenchidas");
        }

        FaixaEtaria faixaEtaria = aluno.getFaixaEtariaAluno();

        System.out.println(faixaEtaria);

        if (etapa != faixaEtaria.descricao) {
            // throw new Exception("O aluno não possui idade válida para participar dessa
            // turma");
        }

        this.listaAlunos.incluirNoFim(aluno);
    }

    public void removerAluno(int index) {
        this.listaAlunos.removerIndex(index);
        ;
    }

    @Override
    public String toString() {
        return "----------------------\n" +
                "Código: " + codigo + "\n" +
                "Etapa : " + etapa + "\n" +
                "Ano   : " + ano + "\n" +
                "Limite   : " + limiteVagas + "\n" +
                "----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Turma outra = (Turma) obj;
        return this.codigo != null && this.codigo.equals(outra.codigo);
    }
}