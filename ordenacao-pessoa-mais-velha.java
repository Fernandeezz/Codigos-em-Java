//Faça um programa que receba a idade de 10 pessoas, apresente a mais velha.

import java.util.Scanner;
public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            idades[i] = scanner.nextInt();
        }
        // ordenação Bubble Sort
        for (int i = 0; i < idades.length - 1; i++) {
            for (int j = 0; j < idades.length - i - 1; j++) {
                if (idades[j] > idades[j+1]) {
                    int temp = idades[j];
                    idades[j] = idades[j+1];
                    idades[j+1] = temp;
                }
            }
        }
        System.out.println("A pessoa mais velha tem " + idades[idades.length-1] + " anos.");
    }
}

