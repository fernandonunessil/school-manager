class Professor {
    private String nome;
    private String departamento;
    private String titulacao;

    public Professor(String nome, String departamento, String titulacao) {
        this.nome = nome;
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    public String getProfessor() {
        return "Nome: " + nome + "\n" +
               "Departamento: " + departamento + "\n" +
               "Titulação: " + titulacao;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return getProfessor();
    }
}