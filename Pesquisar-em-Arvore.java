//Realize o metodo pesquisar em uma arvore

public class Elemento {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento (int valor){
        this.valor=valor;
    }
}

//Foram adicionados os metodos: Pesquisar, In-Orden, Pre-Orden e Pos-Orden de acordo com os slides

public class Arvore{
    private Elemento ele;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(Elemento ele) {
        this.ele = ele;
        this.direita = null;
        this.esquerda = null;
        System.out.println("Criei a arvore com o elemento: " + ele.getValor());
    }

    public boolean isEmpty() {
        return (this.ele == null);
    }

    public void adicionar(Elemento novo) {
        if (isEmpty()) {
            ele = novo;
        } else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValor() < this.ele.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;
                    System.out.println("O elemento : " + novo.getValor() + " adicionado à esquerda do valor :" + this.ele.getValor());
                } else {
                    this.esquerda.adicionar(novo);
                }
            } else if (novo.getValor() > this.ele.getValor()) {

                if (this.direita == null) {
                    this.direita = novaArvore;
                    System.out.println("O elemento :" + novo.getValor() + " adicionado à direita do valor " + this.ele.getValor());

                } else {
                    this.direita.adicionar(novo);
                }
            }
        }
    }

    public boolean pesquisar(int valor) {
        if (isEmpty()) {
            return false; //lista vazia não tem o que buscar
        }
        if (this.ele.getValor() == valor) {
            return true; // se o valor for igual a do raiz
        } else {
            if (valor < this.ele.getValor()) { //se o valor for menor vai para esquerda
                if (this.esquerda == null) { //se na esquerda não tiver valor
                    return false; //não achou
                } else {
                    return this.esquerda.pesquisar(valor);
                }
            } else if (valor > this.ele.getValor()) {
                if (this.direita == null) {
                    return false;
                } else {
                    return this.direita.pesquisar(valor);
                }
            }
            return false;
        }
    }

    public void imprimirPreOrdem(){
        if (!isEmpty()) {
            System.out.print(this.ele.getValor() + " ");
            if (this.esquerda != null) {
                this.esquerda.imprimirPreOrdem();
            } if (this.direita != null) {
                this.direita.imprimirPreOrdem();
            }
        }
    }
    public void imprimirInOrdem(){
        if (!isEmpty()) {
            if (this.esquerda != null) {
                this.esquerda.imprimirInOrdem();
            } System.out.print(this.ele.getValor() + " ");//chegou na raiz
            if (this.direita != null) {
                this.direita.imprimirInOrdem();
            }
        }
    }
    public void imprimirPosOrdem(){
        if (!isEmpty()) {
            if (this.direita != null) {
                this.direita.imprimirPosOrdem();
            } if (this.esquerda != null) {
                this.esquerda.imprimirPosOrdem();
            } System.out.println(this.ele.getValor() + " ");
        }
    }
}

//Se faz necessário importar o if por somente aqui existe a class 'arvore', e apresenta se existe ou não

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Arvore arvore = new Arvore(new Elemento(15));
        arvore.adicionar(new Elemento(25));
        arvore.adicionar(new Elemento(15));
        arvore.adicionar(new Elemento(5));
        arvore.adicionar(new Elemento(30));
        arvore.adicionar(new Elemento(8));
        arvore.adicionar(new Elemento(20));
        arvore.adicionar(new Elemento(31));

        if (arvore.pesquisar(30)) {
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
            //condição? valor se for verdareiro : valor se for falso
            //double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
            System.out.println(" O elemento 6 " + (arvore.pesquisar(30) ? " existe " : "não existe"));
        }
    }
}

