// Usando recursividade, calcule a soma de todos os valores de um array de reais em Java.

public class SomaArrayRecursivo {
    public static double somarArray(double[] array) {
        return somarArrayRecursivo(array, 0);
    }
    private static double somarArrayRecursivo(double[] array, int index) {
        if (index == array.length) {
            return 0; // Caso base: atingiu o final do array, retorna 0 para encerrar a recursão.
        }
        return array[index] + somarArrayRecursivo(array, index + 1);
    }
    public static void main(String[] args) {
        double[] array = {1.5, 2.7, 3.9, 4.2, 5.3};
        double soma = somarArray(array);
        System.out.println("A soma dos valores do array é: " + soma);
    }
}
