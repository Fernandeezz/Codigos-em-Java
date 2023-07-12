public class ordenar{
    public void selection(int [] vet){
        int menor, troca, i, j;
        for (i=0; i<5-1; i++ ){
            menor = 1;
            for (j=i+1; j<5; j++){
                if (vet[j]<vet[menor]){
                    menor = j;
                }
            }
            troca = vet[i];
            vet[i] = vet[menor];
            vet[menor] = troca;
        }
        for (i=0; i<vet.length; i ++){
            System.out.println(vet[i]);
        }
    }
}
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        ordenar selecao = new ordenar();
        int[]vetor = {4, 8, 3, 2, 1};
        selecao.selection(vetor);
    }
}
