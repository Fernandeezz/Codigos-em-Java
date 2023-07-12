//Faça um vetor que receba a lista de bandas musicais e apresente em ordem alfabética com um método de inserção

public class ListaBandas {
    private String[] bandas;
    private int tamanho;
    public ListaBandas(int capacidade) {
        bandas = new String[capacidade];
        tamanho = 0;
        
    }
    public void adicionarBanda(String banda) {
        if (tamanho == bandas.length) {
            throw new RuntimeException("A lista está cheia!");
        }
        bandas[tamanho] = banda;
        for (int i = tamanho; i > 0; i--) {
            if (bandas[i].compareTo(bandas[i - 1]) < 0) {
                String temp = bandas[i];
                bandas[i] = bandas[i - 1];
                bandas[i - 1] = temp;
            }
        }
        tamanho++;
    }
    public void apresentarListaBandas() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(bandas[i]);
        }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite a capacidade da lista: ");
        int tam = meuScanner.nextInt();
        ListaBandas lista = new ListaBandas(tam);
        for (int i=0; i < tam; i++) {
            System.out.println("Por favor, insira o nome da banda: ");
            lista.adicionarBanda(meuScanner.nextLine());
        }
        lista.apresentarListaBandas();
    }
}
