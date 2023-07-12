public class ordenacao{
    public void insertSort(int[] vet){
        int aux, i, j;
        for (i = 0; i< vet.length; i++){
            for (j=0; j<vet.length - 1; j++){
                if (vet[j]> vet[j+1]){
                    aux = vet [j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        for (i=0; i <vet.length; i ++){
            System.out.println("[" + vet[i] + "]");
        }
    }
}
public class principal{
    public static void main(String[] args) {
        ordenacao selecao = new ordenacao();
        int[]vetor = {4, 8, 3, 2, 1};
        selecao.insertSort(vetor);
    }
}
