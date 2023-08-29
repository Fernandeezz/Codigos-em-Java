public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int velocidade = 0;

    public void acelerar(int vel) {
        velocidade = velocidade + vel;
    }

    public void buzinar() {
        System.out.println("O carro faz BANG-BANG!");
    }

    public void reduzir() {
        velocidade = velocidade - 1;
    }
}

public class Principal {
    public static void main(String[] args) throws Exception {
        Veiculo Fusca = new Veiculo();
        Fusca.buzinar();
        Fusca.acelerar(10);
        System.out.println("A velocidade atual do Fusca é de: " + Fusca.velocidade + " Km/h");
        Fusca.reduzir();
        System.out.println("A velocidade reduzida do Fusca é de: " + Fusca.velocidade + " Km/h");

        Veiculo Corsa = new Veiculo();
        Corsa.buzinar();
        Corsa.acelerar(20);
        System.out.println("A velocidade atual do Corsa é de: " + Corsa.velocidade + " Km/h");
        Corsa.reduzir();
        System.out.println("A velocidade reduzida do Corsa é de: " + Corsa.velocidade + " Km/h");
    }
}
