import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
double Salario, Reajuste, SalarioREA;
Scanner meuScanner = new Scanner (System.in);

    System.out.println("Por favor, digite o seu Salario Atual: ");
    Salario = meuScanner.nextDouble();
    Reajuste = Salario*25/100;
        SalarioREA = Salario+Reajuste;
    System.out.println("O seu atual Salario com Reajuste é: "+SalarioREA);
    }
}
