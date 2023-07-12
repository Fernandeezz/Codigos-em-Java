import java.util.Scanner;

public class PesquisaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preenche o vetor com 8 números inteiros
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15};

        // Solicita um número do teclado
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Pesquisa se o número existe no vetor
        boolean encontrado = false;
        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
        // Imprime o resultado da pesquisa
        if (encontrado) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O número " + numero + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

}
