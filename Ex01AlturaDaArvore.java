package ExerciciosMaioADO;

class Node {
    int valor;
    Node Direita;
    Node Esquerda;

    public Node(int valor) {
        this.valor = valor;
        this.Esquerda = null;
        this.Direita = null;
    }
}

class ArvoreBinaria {
    Node raiz;

    public int altura(Node raiz) {
        if (raiz == null) {
            return 0;
        }

        int alturaEsquerda = altura(raiz.Esquerda);

        int alturaDireita = altura(raiz.Direita);

        int maiorAltura = Math.max(alturaEsquerda, alturaDireita);

        return 1 + maiorAltura;
    }
}

public class ExUm {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("Teste 1: Árvore Vazia");
        System.out.println("Altura da árvore vazia: " + arvore.altura(arvore.raiz)); 

        System.out.println();

        System.out.println("Teste 2: Árvore Pequena");

        arvore.raiz = new Node(10);
        arvore.raiz.Esquerda = new Node(5);
        arvore.raiz.Direita = new Node(15);

        System.out.println("Altura da árvore pequena: " + arvore.altura(arvore.raiz)); 
    }
}