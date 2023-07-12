//Faça um vetor que receba a lista de alunos e apresente em ordem alfabética com um método de inserção

public class ListaAlunos {

    private String[] alunos;
    private int tamanho;

    public ListaAlunos(int capacidade) {
        alunos = new String[capacidade];
        tamanho = 0;
    }

    public void adicionarAluno(String aluno) {
        if (tamanho == alunos.length) {
            throw new RuntimeException("Lista de alunos cheia");
        }
        alunos[tamanho] = aluno;
        for (int i = tamanho; i > 0; i--) {
            if (alunos[i].compareTo(alunos[i - 1]) < 0) {
                String temp = alunos[i];
                alunos[i] = alunos[i - 1];
                alunos[i - 1] = temp;
            }
        }
        tamanho++;
    }

    public void apresentarListaAlunos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(alunos[i]);
        }
    }
    
    public static void main(String[] args) {
        ListaAlunos lista = new ListaAlunos(10);
        lista.adicionarAluno("Alice");
        lista.adicionarAluno("Carlos");
        lista.adicionarAluno("Bruno");
        lista.adicionarAluno("Denise");
        lista.adicionarAluno("Eduardo");
        lista.adicionarAluno("Fernanda");
        lista.adicionarAluno("Gustavo");
        lista.adicionarAluno("Bianca");
        lista.adicionarAluno("Ana");
        lista.apresentarListaAlunos();
    }
}
