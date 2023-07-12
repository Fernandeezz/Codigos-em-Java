//Desenvolva um programa que implemente uma lista. O programa deve mostrar ao usuário as seguintes opções:
//Apresentar a lista original
//Apresentar a lista ordenada
//Inserir um novo valor na lista

import java.util.Scanner;

public class Lista {
    public static int[] lista = new int[10];
    public static int tamanho = 0;
    public static void apresentarListaOriginal() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Lista original:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(lista[i] + " ");
            }
            System.out.println();
            
        }
        
    }
    public static void apresentarListaOrdenada() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
        } else {
            int[] listaOrdenada = new int[tamanho];
            System.arraycopy(lista, 0, listaOrdenada, 0, tamanho);
            for (int i = 0; i < tamanho - 1; i++) {
                for (int j = 0; j < tamanho - i - 1; j++) {
                    if (listaOrdenada[j] > listaOrdenada[j + 1]) {
                        int temp = listaOrdenada[j];
                        listaOrdenada[j] = listaOrdenada[j + 1];
                        listaOrdenada[j + 1] = temp;
                    }
                }
            }
            System.out.println("Lista ordenada:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(listaOrdenada[i] + " ");
            }
            System.out.println();
        
        }
    }
    public static void inserirValor() {
        if (tamanho == lista.length) {
            System.out.println("A lista está cheia. Não é possível inserir mais elementos.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor a ser inserido:");
            int valor = scanner.nextInt();
            lista[tamanho] = valor;
            tamanho++;
            System.out.println("Valor inserido com sucesso.");
            
        }
}
  import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        int opcao = 0;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Apresentar a lista original");
            System.out.println("2 - Apresentar a lista ordenada");
            System.out.println("3 - Inserir um novo valor na lista");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    lista.apresentarListaOriginal();
                    break;
                    case 2:
                        lista.apresentarListaOrdenada();
                        break;
                        case 3:
                            lista.inserirValor();
                            break;
                            case 0:
                                System.out.println("Encerrando o programa...");
                                break;
                                default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}
