import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaDeAlunos {
    private List<Aluno> listaAlunos = new ArrayList<>();

    public void incluirNoInicio(Aluno aluno) {
        this.listaAlunos.addFirst(aluno);
    }

    public void incluirNoFim(Aluno aluno) {
        this.listaAlunos.add(aluno);
    }

    public void ordenar() {
        this.listaAlunos.sort(Comparator.comparing(Aluno::getNome));
    }

    public Aluno removerDoFim() {
        return this.listaAlunos.removeLast();
    }

    public void removerIndex(int index) {
        this.listaAlunos.remove(index);
    }

    public int tamanho() {
        return this.listaAlunos.size();
    }

    public Aluno get(int index) {
        return this.listaAlunos.get(index);
    }

    public List<Aluno> getListaAlunos() {
        return this.listaAlunos;
    }
}
