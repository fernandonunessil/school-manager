class Professor {
    private String nome;
    private String departamento;
    private String titulacao;

    public Professor(String nome, String departamento, String titulacao) {
        this.nome = nome;
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getTitulacao() {
        return this.titulacao;
    }
}