public class ExcecaoDeAlunoJaExistente extends Exception {
    public ExcecaoDeAlunoJaExistente() {
        super("Este aluno já está cadastrado no sistema!");
    }
}